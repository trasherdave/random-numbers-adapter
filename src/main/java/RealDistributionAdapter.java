
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class RealDistributionAdapter implements AdapterNumerosAleatorios {

    @Override
    public double random() {

        RealDistribution normalRandom = new NormalDistribution();
        return normalRandom.sample();

    }

    @Override
    public double random(long seed) {

        RealDistribution normalRandom = new NormalDistribution();
        normalRandom.reseedRandomGenerator(seed);
        return normalRandom.sample();

    }

    @Override
    public double[] randomArray(int tamanho) {

          RealDistribution normalRandom = new NormalDistribution();
        return normalRandom.sample(tamanho);
        
    }

}

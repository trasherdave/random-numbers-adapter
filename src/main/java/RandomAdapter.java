
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class RandomAdapter implements AdapterNumerosAleatorios {

    @Override
    public double random() {

        Random random = new Random();
        return random.nextDouble();

    }

    @Override
    public double random(long seed) {

        Random random = new Random(seed);
        return random.nextDouble();

    }

    @Override
    public double[] randomArray(int tamanho) {

        Random random = new Random();
        return random.doubles(tamanho).toArray();

    }

}

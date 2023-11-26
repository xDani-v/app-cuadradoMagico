package org.example;

import org.jgap.Chromosome;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

public class Main {
    public static void main(String[] args) throws Exception  {

            // TODO Auto-generated method stub
            DefaultConfiguration VConfig = new DefaultConfiguration();
            VConfig.setPreservFittestIndividual(true);

            FAptitud vfunapto = new FAptitud();
            VConfig.setFitnessFunction(vfunapto);

            //definir genes
            Gene[] vgene = new Gene[9];
            vgene[0] = new IntegerGene(VConfig,1,9);
            vgene[1] = new IntegerGene(VConfig,1,9);
            vgene[2] = new IntegerGene(VConfig,1,9);
            vgene[3] = new IntegerGene(VConfig,1,9);
            vgene[4] = new IntegerGene(VConfig,1,9);
            vgene[5] = new IntegerGene(VConfig,1,9);
            vgene[6] = new IntegerGene(VConfig,1,9);
            vgene[7] = new IntegerGene(VConfig,1,9);
            vgene[8] = new IntegerGene(VConfig,1,9);

            //definir el cromosoma
            IChromosome vcromosoma = new Chromosome(VConfig,vgene);
            VConfig.setSampleChromosome(vcromosoma);

            //definir el nuero de individuos de la poblacion inicial
            VConfig.setPopulationSize(200);

            //Llenado aleatorio de los 200 individuos
            Genotype poblacion = Genotype.randomInitialGenotype(VConfig);

            for(int genera=1; genera<=2200; genera++)
                poblacion.evolve();

            IChromosome Indmasapto = poblacion.getFittestChromosome();

            Integer vgen0 = (Integer) Indmasapto.getGene(0).getAllele();
            Integer vgen1 = (Integer) Indmasapto.getGene(1).getAllele();
            Integer vgen2 = (Integer) Indmasapto.getGene(2).getAllele();
            Integer vgen3 = (Integer) Indmasapto.getGene(3).getAllele();
            Integer vgen4 = (Integer) Indmasapto.getGene(4).getAllele();
            Integer vgen5 = (Integer) Indmasapto.getGene(5).getAllele();
            Integer vgen6 = (Integer) Indmasapto.getGene(6).getAllele();
            Integer vgen7 = (Integer) Indmasapto.getGene(7).getAllele();
            Integer vgen8 = (Integer) Indmasapto.getGene(8).getAllele();

            System.out.println(vgen0+  "       "+vgen1+"       "+vgen2);
            System.out.println(vgen3+  "       "+vgen4+"       "+vgen5);
            System.out.println(vgen6+  "       "+vgen7+"       "+vgen8);

        }
    }

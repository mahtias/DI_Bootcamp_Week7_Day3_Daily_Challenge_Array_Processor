/**
 * @author N'ZO LAGOU
 * 2) Écrivez une classe qui définit quatre variables finales 
statiques publiques de type ArrayProcessorqui traitent un tableau de la manière suivante :

trouver la valeur maximale dans le tableau,
trouver la valeur minimale dans un tableau,
trouver la somme des valeurs du tableau,
et trouver la moyenne des valeurs dans le tableau.
Dans chaque cas, la valeur de la variable doit être donnée par
 une expression lambda. La classe doit également définir une fonction


 */

package array.processor;

import java.util.Arrays;

public class ClassArrayProcessor {
	public static final ArrayProcessor max = (array) -> {
        return Arrays.stream(array).max().getAsDouble();
    };
    public static final ArrayProcessor min = (array) -> {
        return Arrays.stream(array).min().getAsDouble();
    };
    public static final ArrayProcessor sum = (array) -> {
        return Arrays.stream(array).sum();
    };
    public static final ArrayProcessor average = (array) -> {
        return Arrays.stream(array).average().getAsDouble();
    };

    public static ArrayProcessor counter(double value) {
        return (array) -> {
            return Arrays.stream(array).filter(data -> data == value).count();
        };

    }

}

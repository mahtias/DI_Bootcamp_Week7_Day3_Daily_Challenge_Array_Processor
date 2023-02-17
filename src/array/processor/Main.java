/**
 * @author N'ZO LAGOU
 *3) Cette fonction doit renvoyer un ArrayProcessorqui compte le nombre de fois que cette valeur 
apparaît dans un tableau. La valeur de retour doit être donnée sous la forme d'une expression lambda.

La classe devrait avoir une main()routine qui teste votre travail.

Le programme que vous écrivez pour cet exercice aura besoin d'accéder au fichier ArrayProcessor.
java, qui définit l'interface fonctionnelle.
 */

package array.processor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double[] array = {58, 7, 6.5, 4.1, 3.05, 10.8, 12.4, 13, 15, -7, -1.3, -0.2, 36, 1};
	        System.out.println("the max is: " + ClassArrayProcessor.max.apply(array));
	        System.out.println("the min is: " + ClassArrayProcessor.min.apply(array));
	        System.out.println("the sum is: " + ClassArrayProcessor.sum.apply(array));
	        System.out.println("the average is: " + ClassArrayProcessor.average.apply(array));
	        System.out.println("the value 8 is " + (int) ClassArrayProcessor.counter(8).apply(array) + " fois");
	    }

	}



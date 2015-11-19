/* RunSorts.java
 * Description: Running various sorting methods on the same array 
 * Name: Jaehyung Lim
 * Date: Nov 17, 2015
 */

public class RunSorts {
  
  public static void main( String[] args ) {
    
    // Bublle sort
    BubbleSort b = new BubbleSort();
    System.out.println( "Unsorted: " + b );
    b.sort();
    System.out.println( "SORTED: " + b + "\n" );
    
    // Selection Sort
    SelectionSort s = new SelectionSort();
    System.out.println( "Unsorted: " + s );
    s.sort();
    System.out.println( "SORTED: " + s + "\n" );
    
    // Insertion Sort
    InsertionSort i = new InsertionSort();
    System.out.println( "Unsorted: " + i );
    i.sort();
    System.out.println( "SORTED: " + i + "\n" );
    // Quick Sort
    
    // Merge Sort
    
    // Rdix Sort???
    
    
  } // end main method
  
} // end RunSorts
package MinBinHeap_A3;

public class MinBinHeap_Playground {
  public static void main(String[] args){   
    TestBuild();
  }
  
  public static void TestBuild(){ 
    // constructs a new minbinheap, constructs an array of EntryPair, 
    // passes it into build function. Then print collection and heap.
    
	MinBinHeap mbh= new MinBinHeap();
    EntryPair[] collection= new EntryPair[15];
    
    collection[0]=new EntryPair("i",15);
    collection[1]=new EntryPair("b",8);
    collection[2]=new EntryPair("c",30);
    collection[3]=new EntryPair("d",18);
    collection[4]=new EntryPair("e",6);
    collection[5]=new EntryPair("f",25);
    collection[6]=new EntryPair("g",20);
    collection[7]=new EntryPair("h",21);
    collection[8]=new EntryPair("h",2);
    collection[9]=new EntryPair("h",45);
    collection[10]=new EntryPair("h",4);
    collection[11]=new EntryPair("h",35);
    collection[12]=new EntryPair("h",40);
    collection[13]=new EntryPair("h",10);
    collection[14]=new EntryPair("h",11);
    mbh.build(collection);
    
    printHeapCollection(collection);
    
    /*mbh.insert(collection[0]);
    mbh.insert(collection[2]);
    mbh.insert(collection[1]);
    mbh.insert(collection[3]);
    mbh.insert(collection[4]);
    mbh.insert(collection[5]);
    mbh.insert(collection[6]);*/
    
    printHeap(mbh.getHeap(), mbh.size());
    
    System.out.println("size: " + mbh.size());
    System.out.println("min: " + mbh.getMin().getValue() + " " + mbh.getMin().getPriority());
    printHeap(mbh.getHeap(), mbh.size());
  }
  
  public static void printHeapCollection(EntryPair[] e) { 
    //this will print the entirety of an array of entry pairs you will pass 
    //to your build function.
    System.out.println("Printing Collection to pass in to build function:");
    for(int i=0;i < e.length;i++){
      System.out.print("("+e[i].value+","+e[i].priority+")\t");
    }
    System.out.print("\n");
  }
  
  public static void printHeap(EntryPair[] e,int len) { 
    //pass in mbh.getHeap(),mbh.size()... this method skips over unused 0th index....
    System.out.println("Printing Heap");
    for(int i=1;i < len+1;i++){
      System.out.print("("+e[i].value+","+e[i].priority+")\t");
    }
    System.out.print("\n");
  }
}
class ArrayDemo{

public static void main(String []args){

int evennumbers[]={2,4,6,8,10,12};

System.out.println(evennumbers[3]);
System.out.println("size of an array "+evennumbers.length);

int oddnumbers[]=new int[10];
System.out.println("size of oddnumbers "+oddnumbers.length);
System.out.println(oddnumbers[0]);

oddnumbers[3]=12;
for(int i=0; i< oddnumbers.length;i++){
System.out.println(oddnumbers[i]);
}
}
}
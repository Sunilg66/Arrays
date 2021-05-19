class ArrayDemo2{

public static void main(String []args){

short oddnumbers[]={1,3,5,7,9,11,13};

System.out.println(oddnumbers[4]);
System.out.println("size of an array "+oddnumbers.length);

double evennumbers[]=new double[10];
System.out.println("size of evennumbers "+evennumbers.length);
System.out.println(evennumbers[5]);

evennumbers[5]=12;
for(int i=0; i< evennumbers.length;i++){
System.out.println(evennumbers[i]);
}
}
}
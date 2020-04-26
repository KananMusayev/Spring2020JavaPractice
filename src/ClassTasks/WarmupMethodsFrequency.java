package ClassTasks;

public class WarmupMethodsFrequency {
    public static void main(String[] args) {
        /*
        write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
         */
        System.out.println(frequency("ABAB",'B'));
    }

    public static int frequency(String str,char ch){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}

package Rephlits;

public class Rephlit163 {
    public static void main(String[] args) {

    }

    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {
        if (notEmpty == true&&(taskId - currentId) == 1) {
                return true;
            }
         else {
            return false;
        }

    }
}

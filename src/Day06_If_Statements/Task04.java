package Day06_If_Statements;

public class Task04 {
    public static void main(String[] args) {
        int statusCode = 4000;
        String FinalResult ="Invalid status code";

        if (statusCode==200){
            FinalResult = "OK";}
        if (statusCode==201){
            FinalResult = "Created";}
        if (statusCode==202){
            FinalResult = "Accepted";}
        if (statusCode==301){
            FinalResult = "Moved Permanently";}
        if (statusCode==303){
            FinalResult = "See Other";}
        if (statusCode==304){
            FinalResult = "Not Modified";}
        if (statusCode==307){
            FinalResult = "Temporary Redirect";}
        if (statusCode==400){
            FinalResult = "Bad Request";}
        if (statusCode==401){
            FinalResult = "Unauthorized";}
        if (statusCode==403){
            FinalResult = "Forbidden";}
        if (statusCode==404){
            FinalResult = "not Found";}
        if (statusCode==410){
            FinalResult = "Gone";}
        if (statusCode==500){
            FinalResult = "Internal Server Error";}
        if (statusCode==503){
            FinalResult = "Service Unavailable";}
        System.out.println("Status Code "+statusCode +" is: "+ FinalResult);





    }



}

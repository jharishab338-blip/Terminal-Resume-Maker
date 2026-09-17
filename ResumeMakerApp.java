import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class StudentProfile
 {
    private String Name;
    private String email;
    private String phone;
    private List<String> edu;
    private List<String> skill;
    public StudentProfile() {
        edu = new ArrayList<>();
        skill = new ArrayList<>();
    }public void setDetails(String name, String email, String phone) {
        this.Name = name;
        this.email = email;
        this.phone = phone;}
        public void pushEducation(String degree) { 
        this.edu.add(degree); 
    }
    public void pushSkill(String newSkill) { 
        this.skill.add(newSkill); }
    public void saveAsTextFile() throws IOException {
        String output = Name.replace(" ", "_") + "_Resume.txt";
        
        
        try (FileWriter fileOut = new FileWriter(output)) {
            fileOut.write("" + Name.toUpperCase() + "\n");
            fileOut.write("Contact:" + email + " " + phone + "\n\n");
            fileOut.write(" ACADEMIC  \n");
            for (String school : edu) { 
                fileOut.write("" + school + "\n");}
            fileOut.write("\n");
            
            fileOut.write("SKILLS \n");
            for (String sk:skill) { 
                fileOut.write("" + sk + "\n"); 
            }
            System.out.println("\n Resume saved as:" + output);}}}
public class ResumeMakerApp
         {public static void main(String[] args) {
        Scanner readInt = new Scanner(System.in);
        StudentProfile myProfile = new StudentProfile();
        boolean isRunning = true;
        System.out.println("*** Welcome to the Terminal Resume Maker ***");
        while (isRunning) {
            System.out.println("\nMain Menu:");
            System.out.println("1 Setup Personal Info");
            System.out.println("2 Add an Education Entry");
            System.out.println("3 Add a Skill");
            System.out.println("4 Generate File and Quit");
            System.out.print("What do you want to do? ");
            try 
            {int opt = readInt.nextInt();
                readInt.nextLine(); 
                switch (opt)
                {
                    case 1:
                        System.out.print("Enter your full name: ");
                        String n = readInt.nextLine();
                        System.out.print("Enter email address: ");
                        String e = readInt.nextLine();
                        System.out.print("Enter phone number: ");
                        String p = readInt.nextLine();
                        myProfile.setDetails(n, e, p);
                        System.out.println("Details saved.");
                        break;
                    case 2:
                        System.out.print("Type your degree and college name: ");
                        String deg = readInt.nextLine();
                        myProfile.pushEducation(deg);
                        System.out.println(" Education saved.");
                        break;
                    case 3:
                        System.out.print("Type a skill you know: ");
                        String sk = readInt.nextLine();
                        myProfile.pushSkill(sk);
                        System.out.println("Skill saved.");
                        break;
                    case 4:
                        myProfile.saveAsTextFile();
                        isRunning = false;
                        break;
                    default:
                        System.out.println("wrong choice. Pick between 1 and 4.");} } 
            catch (InputMismatchException err){
                System.out.println("Wait, you need to type a number!");
                readInt.nextLine();} 
            catch (IOException err){
                System.out.println("File error happened: " + err.getMessage ());} 
            catch (Exception err){
                System.out.println("Something went wrong: " + err.getMessage ());}}
        readInt.close();}}
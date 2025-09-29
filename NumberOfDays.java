import java.util.Scanner;
public class NumberOfDays {
    static int dayYear(int year,int dyear){
        int dayy = 0;
        for (int i = year;i < dyear;i++){
            if(( i % 4)==0){
                dayy += 366;
            }else{
                dayy += 365;
            }
        }
        return dayy;
    }
    static int daysMonth(int month,int year,int day){
        int daysm =0;
        for (int i = 1;i<month;i++){
            if(i ==9 || i==4||i==6||i==11){
                daysm += 30;
            }else if(i==2){
                if(year%4 == 0){
                    daysm += 29;
                }else{
                    daysm += 28;
                }
            }else{
                daysm += 31;
            }
        }
        return daysm + day;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int date,month,year;
        int ddate,dmonth,dyear;
        System.out.print("Enter the date of birth:");
        date = scanner.nextInt();
        System.out.print("Enter the month of birth:");
        month = scanner.nextInt();
        System.out.print("Enter the year of birth:");
        year = scanner.nextInt();
        System.out.print("Enter the date today:");
        ddate = scanner.nextInt();
        System.out.print("Enter the month today:");
        dmonth = scanner.nextInt();
        System.out.print("Enter the year today:");
        dyear = scanner.nextInt();
        System.out.println("Date of birth:" + date +"-"+ month +"-"+ year);
        System.out.println("Date Today:" + ddate +"-"+ dmonth +"-"+ dyear);
        System.out.println(dayYear(year,dyear) - daysMonth(month,year,date)+daysMonth(dmonth,dyear,ddate));
        
        scanner.close();
    }
}
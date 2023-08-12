import java.util.Scanner;

public class trainreserve{
 public static void main(String[] args) {
        int train_availability=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Where are you going from?");
        String str=input.nextLine();
        System.out.println("train availabilty in southernrailway:1.Tamilnadu 2.Kerala 3.Andhra Pradesh 4.karnataka 5.union territories 6.Puducherry");
        int a=input.nextInt();
        if(a==1)
        System.out.println("Tamilnadu trains:1.Chennai 2.Coimbatore 3.Katpadi 4.Madurai 5.Salem 6.Erode 7.Dindigul 8.Karur 9.Nagercoil 10.Tiruchirapalli 11.Tirunelveli 12.Sivakasi 13.Virudhunagar");
        int b=input.nextInt();
        switch(b){
            case 1:
                System.out.println("Chennai to 1.kanyakumari 2.tirunelveli 3.Sivakasi 4.virudhunagar 5.Madurai 6.Tiruchi 7.Dindigul 8.coimbatore 9.kadaloore 10.Rameswaram 11.vilupuram 12.virudhachalam 13.sattur 14.kovilpatti 15.Thoodhukudi 15.Tenkasi ");
                int c=input.nextInt();
                switch(c){
                    case 1:
                    System.out.println("1.161127-Guruvayur Express 2.12642-Thirukkural Express 3.12633-Kanniyakumari SuperFast Express 4.22657-Nagercoil jn.SF Expresss 5.16823-Anandhapuri Express 6.20691-Nagercoil Antyodaya SF Express");
                    int d=input.nextInt();
                    Switch(d){
                        case 1:
                        System.out.println("Seat availability:No avialble");
                        case 2;
                        System.out.println("Seat availability:this train not vailable in 12 hours");
                    }
                    case 2:
                    System.out.println("1.161127-Guruvayur Express 2.12642-Thirukkural Express 3.12633-Kanniyakumari SuperFast Express 4.22657-Nagercoil jn.SF Expresss 5.16823-Anandhapuri Express 6.20691-Nagercoil Antyodaya SF Express 7.16105-Tiruchendur Express 8.12631-Nellai SF Express 9.20683-Sengottai SF Express");
                    int e=input.nextInt();

                    case 3:
                    System.out.println("1.16101-Kollam Express 2.Pothigai SF Express");
                    int f=input.nextInt();
                    case 4:
                    System.out.println("1.161127-Guruvayur Express 2.12642-Thirukkural Express 3.12633-Kanniyakumari SuperFast Express 4.22657-Nagercoil jn.SF Expresss 5.16823-Anandhapuri Express 6.20691-Nagercoil Antyodaya SF Express 7.16101-Kollam Express 8.Pothigai SF Express 9.12693-Pearl City Super Fast Express");
                    int g=input.nextInt();


                
                }

        }
    }
}
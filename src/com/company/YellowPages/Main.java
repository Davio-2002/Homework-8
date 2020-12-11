package com.company.YellowPages;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.nextLine();

        Company company = new Company("Grand Candy", " 0061, Yerevan Masisi St., 31 Building (Shengavit adm. district).", 150, "https://www.google.com/search?tbs=lf:1,lf_ui:4&tbm=lcl&sxsrf=ALeKk02_rFxe6kjgEAzAtaCucFIam9X99Q:1607153229081&q=grand+candy+hasce&rflfq=1&num=10&ved=2ahUKEwjOmsaqqLbtAhXNCuwKHfcICdIQtgN6BAgGEAc#rlfi=hd:;si:;mv:[[40.2269465,44.5896957],[40.1368112,44.432681599999995]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:4", "https://www.spyur.am/am/companies/grand-candy/2768");
        Company company1 = new Company("Mobile Center", "27 Tumanyan St · (011) 540000", 500, "https://www.google.com/search?tbs=lf:1,lf_ui:4&tbm=lcl&sxsrf=ALeKk0340vrXQ6XPqlRMnCVe_1TVo5nVzg:1607153350065&q=mobile+centre&rflfq=1&num=10&ved=2ahUKEwiaup7kqLbtAhXIMewKHRkdC3sQtgN6BAgEEAc#rlfi=hd:;si:;mv:[[40.2210763,44.5994816],[39.9447942,44.4679261]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:4", "https://www.google.com/search?q=mobile+centre&oq=mobile&aqs=chrome.0.0i433j69i57j0j69i59j0l3.1373j0j1&sourceid=chrome&ie=UTF-8");
        Company company2 = new Company("iStyle", "1, 4 Northern Ave, Yerevan", 100, "https://www.google.com/maps/place/iSTYLE+Armenia/@40.1837616,44.5150288,15z/data=!4m2!3m1!1s0x0:0x62ec831aeefdaf7b?sa=X&ved=2ahUKEwixgLLQqbbtAhUssKQKHUuxAZcQ_BIwCnoECBQQBQ", "http://istyle.am/");

        HashMap<String, Company> companyHashMap = new HashMap<>();
        companyHashMap.put(company.getName(), company);
        companyHashMap.put(company1.getName(), company1);
        companyHashMap.put(company2.getName(), company2);

        for (String i : companyHashMap.keySet()) {
            if (companyName.equals(i)) {
                System.out.println(companyHashMap.get(i).toString());
            }
        }
    }
}

package guru.qa.docs;

import static guru.qa.utils.RandomUtils.*;

public class RandomExamples {
    public static void main(String[] args) {
        System.out.println(getRandomString(32));
//        $("#id").setValue(getRandomString(32))

        String randomMessage = getRandomMessage(32, 42);
        System.out.println(randomMessage);

        int randomInt = getRandomInt(223333, 100000000);
        System.out.println(randomInt + "");

        String randomPhone = getRandomPhone();
        System.out.println(randomPhone);

        String randomPhoneWithPrefix = getRandomPhone("+7");
        System.out.println(randomPhoneWithPrefix);

        String difficultRandomPhoneWithPrefix = getDifficultRandomPhone("+8");
        System.out.println(difficultRandomPhoneWithPrefix);

        String randomEmail = getRandomEmail();
        System.out.println(randomEmail);
    }
}

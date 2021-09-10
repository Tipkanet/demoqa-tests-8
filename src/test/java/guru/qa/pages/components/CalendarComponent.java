package guru.qa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day +
                ":not(.react-datepicker__day--outside-month)").click();


//        $(".react-datepicker__day--028:not(.react-datepicker__day--outside-month)").click();
//        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
//
////        String.format
//        String selector = ".react-datepicker__day--028:not(.react-datepicker__day--outside-month)";
//        $(selector).click();
//
//        String selector1 = ".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)";
//        String formatedSelector = String.format(selector1, day);
//        $(formatedSelector).click();
//
//
//        String bigtext = "apple %s banana %s ananas %s %s";
//        String b = "and";
//        String c = "not";
//
//        System.out.println(String.format(bigtext, b, c, b, c));
    }
}

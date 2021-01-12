import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // TODO fill in code here for extracting IP address using Regular Expression
        String oneSegment = "([0-9]{1,2}|1[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        String regexString = "\\b" + oneSegment + "\\." + oneSegment + "\\." + oneSegment + "\\." + oneSegment + "\\b";
        Pattern pattern = Pattern.compile(regexString);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find())
            return matcher.group(0);
        return "";
    }
}
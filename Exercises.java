package excerises;

import edu.harvard.med.open.Command;
import edu.harvard.med.open.Interval;
import java.util.Collection;
import java.util.Set;

public final class Exercises {

    //No argument constructor
    public Exercises() {

    }

    public String censor(final String text, final Set<String> bannedTerms) {
        //text = "Hey there";
        //bannedTerms = "there";
        String storeText = text;

        for (String term : bannedTerms) {

            String replaceWithStar = "";
            int lengthOfBannedTerm = term.length();

            for (int i = 0; i < lengthOfBannedTerm; i++) {
                replaceWithStar += "*";
            }

            storeText = storeText.replaceAll(term, replaceWithStar);

        }
        return storeText;

    }

    public String exceptionalHandling(final Command command, final String exceptionText) {
        return null; //TODO
    }

    public boolean isPalindrome(final String text) {

        if (text == null) {
            return false;
        }

        String myText = text.toLowerCase();
        String copyText = "";
        for (int i = myText.length() - 1; i >= 0; i--) {
            copyText = copyText + myText.charAt(i);
        }
        return copyText.equals(myText);

    }

    public int pascal(final int column, final int row) {
        
        if(row<column || row<0 || column<0)
        {
            return -1;
        }
     
        if (column == 0) {
            return 1;
        }
        else {
            return (row * pascal(column - 1,row - 1)) / column;
        }
    }

    public Collection<Interval> mergeIntervals(final Collection<Interval> ivals) {
        
        return null; //TODO
    }
}

package exam_sv2_part1_potpot.arrayoperation;

public class ArrayOperation {

    public String getWordsBackwards(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

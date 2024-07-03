package exam_sv3_part1.videos;

import java.util.ArrayList;
import java.util.List;

public class StreamingPlatform {

    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public int findMaxViews() {

        int maxViews = 0;

        for (User actual : users) {
            int actualSum = actual.sumOfViews();
            if (actualSum > maxViews) {
                maxViews = actualSum;
            }
        }

        return maxViews;
    }
}

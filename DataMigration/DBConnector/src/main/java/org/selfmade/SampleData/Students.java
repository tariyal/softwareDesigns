package org.selfmade.SampleData;

import java.util.Random;

public class Students {

    static void getSample(){
        Random rand = new Random();
        Document student = new Document("_id", new ObjectId());
        student.append("student_id", 10000d)
                .append("class_id", 1d)
                .append("scores", asList(new Document("type", "exam").append("score", rand.nextDouble() * 100),
                        new Document("type", "quiz").append("score", rand.nextDouble() * 100),
                        new Document("type", "homework").append("score", rand.nextDouble() * 100),
                        new Document("type", "homework").append("score", rand.nextDouble() * 100)));
    }
}

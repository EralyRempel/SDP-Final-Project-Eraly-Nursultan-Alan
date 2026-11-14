package strategy;

import java.util.List;

public class WeightedGradingStrategy implements GradingStrategy {
    @Override
    public double calculateFinalGrade(List<Double> grades) {
        if (grades.isEmpty()) return 0.0;
        if (grades.size() == 1) return grades.get(0);

        double homeworkSum = 0;
        for (int i = 0; i < grades.size() - 1; i++) {
            homeworkSum += grades.get(i);
        }
        double avgHomework = homeworkSum / (grades.size() - 1);
        double examGrade = grades.get(grades.size() - 1);

        return (avgHomework * 0.4) + (examGrade * 0.6);
    }
}
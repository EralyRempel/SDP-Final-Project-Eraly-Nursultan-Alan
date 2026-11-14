package strategy;

import java.util.List;

public class StandardGradingStrategy implements GradingStrategy {
    @Override
    public double calculateFinalGrade(List<Double> grades) {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }
}
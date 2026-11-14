package strategy;

import java.util.List;

public class CourseEvaluator {
    private GradingStrategy strategy;

    public void setStrategy(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public double evaluate(List<Double> grades) {
        if (strategy == null) {
            throw new IllegalStateException("Grading strategy is not set!");
        }
        return strategy.calculateFinalGrade(grades);
    }
}
package strategy;

import java.util.List;

public interface GradingStrategy {
    double calculateFinalGrade(List<Double> grades);
}
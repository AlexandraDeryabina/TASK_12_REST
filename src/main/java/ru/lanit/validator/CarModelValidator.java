package ru.lanit.validator;

import ru.lanit.constraint.CarModelConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CarModelValidator implements
        ConstraintValidator<CarModelConstraint, String> {

    private int quantity;
    private String delimiter;

    @Override
    public void initialize(CarModelConstraint constraintAnnotation) {
        this.quantity = constraintAnnotation.value();
        this.delimiter = constraintAnnotation.delimiter();
    }

    @Override
    public boolean isValid(String model, ConstraintValidatorContext constraintValidatorContext) {
        String[] modelPieces = model.split(delimiter);
        if (modelPieces.length != quantity) {
            return false;
        }

        for (String piece: modelPieces) {
            if (piece.length() == 0) {
                return false;
            }
        }

        return true;
    }

}

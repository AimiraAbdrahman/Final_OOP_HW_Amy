package Model.impl;

public class ImNumber extends ComplexNumber{
    protected double imaginary;

    public ImNumber(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getIm()
	{
		return this.imaginary;
	}
}

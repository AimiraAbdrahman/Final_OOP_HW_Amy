package Service;

import Model.impl.ComplexNumber;

public class ComplexNumberService implements NumberService<ComplexNumber>{

    @Override
    public ComplexNumber add(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.real + z2.real, z1.imaginary + z2.imaginary);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.real - z2.real, z1.imaginary - z2.imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber z1, ComplexNumber z2) {
        double _real = z1.real*z2.real - z1.imaginary*z2.imaginary;
		double _imaginary = z1.real*z2.imaginary + z1.imaginary*z2.real;
		return new ComplexNumber(_real,_imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber z1, ComplexNumber z2) {
        ComplexNumber output = multiply(z1,conjugate(z2));
		double div = Math.pow(mod(z2),2);
		return new ComplexNumber(output.real/div,output.imaginary/div);
    }

    @Override
    public ComplexNumber square(ComplexNumber z1) {
        double _real = z1.real*z1.real - z1.imaginary*z1.imaginary;
		double _imaginary = 2*z1.real*z1.imaginary;
		return new ComplexNumber(_real,_imaginary);
    }

    // Методы, характерные только для комплексных чисел

    public ComplexNumber conjugate(ComplexNumber z1) {
        return new ComplexNumber(z1.real,-z1.imaginary);
    }

    public double mod(ComplexNumber z) {
        return Math.sqrt(Math.pow(z.real,2) + Math.pow(z.imaginary,2));
    }

    public static ComplexNumber pow(ComplexNumber z, int power)
	{
		ComplexNumber output = new ComplexNumber(getRe(z),getIm(z));
		for(int i = 1; i < power; i++)
		{
			double _real = output.real*z.real - output.imaginary*z.imaginary;
			double _imaginary = output.real*z.imaginary + output.imaginary*z.real;
			output = new ComplexNumber(_real,_imaginary);
		}
		return output;
	}

    public static double getRe(ComplexNumber z)
	{
		return z.real;
	}

    public static double getIm(ComplexNumber z)
    {
        return z.imaginary;
    }

}

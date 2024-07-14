package Service;

import Model.MyNumber;

public interface NumberService<T extends MyNumber> {
    T add(T z1, T z2);
	T subtract(T z1, T z2);	
	T multiply(T z1, T z2);	
	T divide(T z1, T z2);
	T square(T z1);
}

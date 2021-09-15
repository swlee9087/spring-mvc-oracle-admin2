package shop.cofin.oracle.common;

import java.util.List;

/*import org.springframework.web.bind.annotation.RequestBody;*/

public interface GenericInterface<T,U> {
	
	List<?> findAll();
	T findById (U id);	
	void update(T t);  //overriding
	void delete(U id);
	void save(T t);  //C
	
}

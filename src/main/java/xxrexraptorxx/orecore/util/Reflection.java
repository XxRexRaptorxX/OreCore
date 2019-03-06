package xxrexraptorxx.orecore.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraftforge.fml.relauncher.ReflectionHelper;


//Code by Insane-96
public class Reflection {

	public static Method becomeAngryAt;
	
	public static void Init() {
		try {
			becomeAngryAt = ReflectionHelper.findMethod(EntityPigZombie.class, "becomeAngryAt", "func_70835_c", Entity.class);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Set(Field field, Object object, Object value) {
		try {
			field.set(object, value);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public static Object Get(Field field, Object object) {
		try {
			return field.get(object);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Object Invoke(Method method, Object object, Object... params) {
		try {
			return method.invoke(object, params);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
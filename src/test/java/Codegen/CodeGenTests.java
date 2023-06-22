package Codegen;

import Helper.MyClassLoader;
import Helper.TestData;
import Helper.TestHelper;
import bytecode.ProgramBytecode;
import lombok.var;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import parser.ParserAPI;
import semantic.SemanticChecker;
import semantic.TypeCheckResult;
import syntax.structure.ClassDecl;
import syntax.structure.Program;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CodeGenTests {

    @Test
    @DisplayName("Control Test, Instantiate Empty generated Class")
    void emptyClass_OK() {

        MyClassLoader myClassLoader = new MyClassLoader("AST/Empty.java");

        Class<?> myclass = myClassLoader.findClassByName("Empty");

        try {

            Object o = myclass.getDeclaredConstructor().newInstance();

            assertEquals(o.getClass().getName(), "Empty");

        } catch (InvocationTargetException | InstantiationException | RuntimeException | NoSuchMethodException | IllegalAccessException e) {

            fail(e.getMessage());

        }
    }

    @Test
    @DisplayName("Instantiate Empty Class")
    void testt() {

        MyClassLoader myClassLoader = new MyClassLoader(TestData.getEmptyClassWithConstructor("MyClass"));

        Class<?> myclass = myClassLoader.findClassByName("MyClass");

        try {

            Object o = myclass.getDeclaredConstructor().newInstance();

            assertEquals(o.getClass().getName(), "MyClass");

        } catch (InvocationTargetException | InstantiationException | RuntimeException | NoSuchMethodException | IllegalAccessException e) {

            fail(e.getMessage());

        }

    }


    @Test
    @DisplayName("Instantiate with custom Constructor")
    void canInstantiateObjectWithConstructor() {

        MyClassLoader myClassLoader = new MyClassLoader(TestData.getEmptyClassWithConstructorAndParameter("MyClass"));

        Class<?> myclass = myClassLoader.findClassByName("MyClass");

        try {

            Object o = myclass.getDeclaredConstructor(int.class, int.class).newInstance(1,1);

            assertEquals(o.getClass().getName(), "MyClass");

        } catch (InvocationTargetException | InstantiationException | RuntimeException | NoSuchMethodException | IllegalAccessException e) {

            fail(e.getMessage());

        }

    }


    @Test
    @DisplayName("set FieldValue in Constructor with Parameters")
    void setFieldValue_OK() {

        MyClassLoader myClassLoader = new MyClassLoader(TestData.getConstructorWithThisAssign("ConstructorWithThisAssign"));

        Class<?> myclass = myClassLoader.findClassByName("ConstructorWithThisAssign");

        try {
            Constructor<?>[] c = myclass.getDeclaredConstructors();

            Object o = myclass.getDeclaredConstructor(int.class, int.class).newInstance(1,2222);

            Field fieldAa = myclass.getDeclaredField("aa");
            Field fieldBb = myclass.getDeclaredField("bb");

            fieldAa.setAccessible(true);
            fieldBb.setAccessible(true);

            assertEquals(1 ,fieldAa.get(o));
            assertEquals(2222, fieldBb.get(o));

            assertEquals(2 ,fieldAa.getModifiers());
            assertEquals(int.class, fieldAa.getType());

            assertEquals(o.getClass().getName(), "ConstructorWithThisAssign");

        } catch (InvocationTargetException | InstantiationException | RuntimeException
                 | NoSuchMethodException | NoSuchFieldException | IllegalAccessException e) {

            fail(e.getMessage());

        }

    }
}



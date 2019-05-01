package oop.Annotation.example_001;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
public @interface DefaultConstructor {
}

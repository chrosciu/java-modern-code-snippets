import java.util.List;

String greeting = "Hello World";

List<String> greeting() {
    return List.of(greeting);
}

void main() {
    System.out.println(greeting());
}

//to run main() method class does not need to be explicitly defined now
//`private` & `static` modifiers can also be used here as well as `this` keyword


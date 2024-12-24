package eu.chrost.stringtemplates;

//import static java.lang.StringTemplate.RAW;

//Commented out as string templates have been withdrawn from JDK 23 !!!

class S01STRTemplate {
    public static void main(String[] args) {
//        //STR is a processor automatically imported as public static final field to each compilation unit
//        //StringTemplate.Processor<String, RuntimeException> STR = StringTemplate::interpolate;
//
//        String name = "Joan";
//        String info = STR."My name is \{name}";
//        System.out.println(info);
//
//        //STR."..." is a syntactic sugar that really calls STR.process("...")
//        //RAW is a template processor that just returns the same template
//        //StringTemplate.Processor<StringTemplate, RuntimeException> RAW = st -> st;
//
//        String name2 = "Marcin";
//        StringTemplate st = RAW."My name is \{name2}";
//        String info2 = STR.process(st);
//        System.out.println(info2);
//
//        //It is not allowed to directly assign to String a literal with templates inside
//        //(detected by compiler)
//
//        String name3 = "Ola";
//        //String info3 = "My name is \{name3}"; //compilation error
//
//        //Arithmetic can be performed inside ST
//
//        int x = 10, y = 20;
//        String s = STR."\{x} + \{y} = \{x + y}";
//        System.out.println(s);
//
//        //Method calls and field access is allowed inside ST
//
//        class Data {
//            int x = 5;
//
//            int xPlus(int add) {
//                return x + add;
//            }
//        }
//        Data data = new Data();
//
//        String s2 = STR."\{data.x} + 1 = \{data.xPlus(1)}";
//        System.out.println(s2);
    }
}

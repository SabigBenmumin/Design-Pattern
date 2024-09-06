// interface  Pizza{
//     String getDescription();
//     double cost();
// }

public class Plain implements Pizza{

    @Override
    public String getDescription() {
        return "Pizza ma laew kubb";
    }

    @Override
    public double cost() {
        return 20;
    }
}
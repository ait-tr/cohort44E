public class AddParenthesisTransformer extends Transformer{
    @Override
    String transform(String str) {
        return  "(" + str + ")";
    }
}

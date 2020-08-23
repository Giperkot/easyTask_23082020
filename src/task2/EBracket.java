package task2;

public enum EBracket {

    CIRCULE_BEGIN(1, '(', 1, 0),
    CIRCULE_END(2, ')', 1, 1),
    SQUARE_BEGIN(3, '[', 2, 0),
    SQUARE_END(4, ']', 2, 1),
    CURVE_BEGIN(5, '{', 3, 0),
    CURVE_END(6, '}', 3, 1);

    private int id;

    private char symbol;

    private int code;

    private int type;

    EBracket(int id, char symbol, int code, int type) {
        this.id = id;
        this.symbol = symbol;
        this.code = code;
        this.type = type;
    }

    public static EBracket getBySymbol (char symbol) {
        switch (symbol) {
            case '(':
                return CIRCULE_BEGIN;
            case ')':
                return CIRCULE_END;
            case '[':
                return SQUARE_BEGIN;
            case ']':
                return SQUARE_END;
            case '{':
                return CURVE_BEGIN;
            case '}':
                return CURVE_END;
        }

        return null;
    }

    public int getId() {
        return id;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getCode() {
        return code;
    }

    public int getType() {
        return type;
    }
}

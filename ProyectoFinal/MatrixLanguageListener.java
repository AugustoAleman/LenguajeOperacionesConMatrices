// Generated from MatrixLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatrixLanguageParser}.
 */
public interface MatrixLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MatrixLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MatrixLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(MatrixLanguageParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(MatrixLanguageParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(MatrixLanguageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(MatrixLanguageParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(MatrixLanguageParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(MatrixLanguageParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MatrixLanguageParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MatrixLanguageParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MatrixLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MatrixLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(MatrixLanguageParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(MatrixLanguageParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MatrixLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MatrixLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(MatrixLanguageParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(MatrixLanguageParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(MatrixLanguageParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(MatrixLanguageParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(MatrixLanguageParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(MatrixLanguageParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#matrix_declare}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_declare(MatrixLanguageParser.Matrix_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#matrix_declare}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_declare(MatrixLanguageParser.Matrix_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#matrix_assignation}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_assignation(MatrixLanguageParser.Matrix_assignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#matrix_assignation}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_assignation(MatrixLanguageParser.Matrix_assignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(MatrixLanguageParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(MatrixLanguageParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#printM}.
	 * @param ctx the parse tree
	 */
	void enterPrintM(MatrixLanguageParser.PrintMContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#printM}.
	 * @param ctx the parse tree
	 */
	void exitPrintM(MatrixLanguageParser.PrintMContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(MatrixLanguageParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(MatrixLanguageParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(MatrixLanguageParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(MatrixLanguageParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MatrixLanguageParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MatrixLanguageParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_main}.
	 * @param ctx the parse tree
	 */
	void enterTk_main(MatrixLanguageParser.Tk_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_main}.
	 * @param ctx the parse tree
	 */
	void exitTk_main(MatrixLanguageParser.Tk_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_int}.
	 * @param ctx the parse tree
	 */
	void enterTk_int(MatrixLanguageParser.Tk_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_int}.
	 * @param ctx the parse tree
	 */
	void exitTk_int(MatrixLanguageParser.Tk_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_matrix}.
	 * @param ctx the parse tree
	 */
	void enterTk_matrix(MatrixLanguageParser.Tk_matrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_matrix}.
	 * @param ctx the parse tree
	 */
	void exitTk_matrix(MatrixLanguageParser.Tk_matrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_id}.
	 * @param ctx the parse tree
	 */
	void enterTk_id(MatrixLanguageParser.Tk_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_id}.
	 * @param ctx the parse tree
	 */
	void exitTk_id(MatrixLanguageParser.Tk_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_number}.
	 * @param ctx the parse tree
	 */
	void enterTk_number(MatrixLanguageParser.Tk_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_number}.
	 * @param ctx the parse tree
	 */
	void exitTk_number(MatrixLanguageParser.Tk_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_print_matrix}.
	 * @param ctx the parse tree
	 */
	void enterTk_print_matrix(MatrixLanguageParser.Tk_print_matrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_print_matrix}.
	 * @param ctx the parse tree
	 */
	void exitTk_print_matrix(MatrixLanguageParser.Tk_print_matrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_write}.
	 * @param ctx the parse tree
	 */
	void enterTk_write(MatrixLanguageParser.Tk_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_write}.
	 * @param ctx the parse tree
	 */
	void exitTk_write(MatrixLanguageParser.Tk_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterTk_semicolon(MatrixLanguageParser.Tk_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitTk_semicolon(MatrixLanguageParser.Tk_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_comma}.
	 * @param ctx the parse tree
	 */
	void enterTk_comma(MatrixLanguageParser.Tk_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_comma}.
	 * @param ctx the parse tree
	 */
	void exitTk_comma(MatrixLanguageParser.Tk_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_open_brace}.
	 * @param ctx the parse tree
	 */
	void enterTk_open_brace(MatrixLanguageParser.Tk_open_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_open_brace}.
	 * @param ctx the parse tree
	 */
	void exitTk_open_brace(MatrixLanguageParser.Tk_open_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_close_brace}.
	 * @param ctx the parse tree
	 */
	void enterTk_close_brace(MatrixLanguageParser.Tk_close_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_close_brace}.
	 * @param ctx the parse tree
	 */
	void exitTk_close_brace(MatrixLanguageParser.Tk_close_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_open_par}.
	 * @param ctx the parse tree
	 */
	void enterTk_open_par(MatrixLanguageParser.Tk_open_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_open_par}.
	 * @param ctx the parse tree
	 */
	void exitTk_open_par(MatrixLanguageParser.Tk_open_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_close_par}.
	 * @param ctx the parse tree
	 */
	void enterTk_close_par(MatrixLanguageParser.Tk_close_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_close_par}.
	 * @param ctx the parse tree
	 */
	void exitTk_close_par(MatrixLanguageParser.Tk_close_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_open_bracket}.
	 * @param ctx the parse tree
	 */
	void enterTk_open_bracket(MatrixLanguageParser.Tk_open_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_open_bracket}.
	 * @param ctx the parse tree
	 */
	void exitTk_open_bracket(MatrixLanguageParser.Tk_open_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_close_bracket}.
	 * @param ctx the parse tree
	 */
	void enterTk_close_bracket(MatrixLanguageParser.Tk_close_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_close_bracket}.
	 * @param ctx the parse tree
	 */
	void exitTk_close_bracket(MatrixLanguageParser.Tk_close_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_assign}.
	 * @param ctx the parse tree
	 */
	void enterTk_assign(MatrixLanguageParser.Tk_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_assign}.
	 * @param ctx the parse tree
	 */
	void exitTk_assign(MatrixLanguageParser.Tk_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_add}.
	 * @param ctx the parse tree
	 */
	void enterTk_add(MatrixLanguageParser.Tk_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_add}.
	 * @param ctx the parse tree
	 */
	void exitTk_add(MatrixLanguageParser.Tk_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_subtract}.
	 * @param ctx the parse tree
	 */
	void enterTk_subtract(MatrixLanguageParser.Tk_subtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_subtract}.
	 * @param ctx the parse tree
	 */
	void exitTk_subtract(MatrixLanguageParser.Tk_subtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_product}.
	 * @param ctx the parse tree
	 */
	void enterTk_product(MatrixLanguageParser.Tk_productContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_product}.
	 * @param ctx the parse tree
	 */
	void exitTk_product(MatrixLanguageParser.Tk_productContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#tk_inverse}.
	 * @param ctx the parse tree
	 */
	void enterTk_inverse(MatrixLanguageParser.Tk_inverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#tk_inverse}.
	 * @param ctx the parse tree
	 */
	void exitTk_inverse(MatrixLanguageParser.Tk_inverseContext ctx);
}
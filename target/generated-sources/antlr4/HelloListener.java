// Generated from Hello.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(HelloParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(HelloParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#r1}.
	 * @param ctx the parse tree
	 */
	void enterR1(HelloParser.R1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r1}.
	 * @param ctx the parse tree
	 */
	void exitR1(HelloParser.R1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#r2}.
	 * @param ctx the parse tree
	 */
	void enterR2(HelloParser.R2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r2}.
	 * @param ctx the parse tree
	 */
	void exitR2(HelloParser.R2Context ctx);
}
package org.jetbrains.plugins.groovy.lang.surroundWith.surrounders.surroundersImpl.expressions;

import org.jetbrains.plugins.groovy.lang.surroundWith.surrounders.GroovySingleElementSurrounder;
import org.jetbrains.plugins.groovy.lang.psi.api.statements.expressions.GrExpression;
import com.intellij.psi.PsiElement;

/**
 * User: Dmitry.Krasilschikov
 * Date: 22.05.2007
 */
public abstract class GroovyExpressionSurrounder extends GroovySingleElementSurrounder {
  protected boolean isApplicable(PsiElement element) {
    return element instanceof GrExpression;
  }
}

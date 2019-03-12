/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
/* Generated By:JJTree: Do not edit this line. ASTDatasetClause.java */

package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTDatasetClause extends SimpleNode {

	private boolean named;

	public ASTDatasetClause(int id) {
		super(id);
	}

	public ASTDatasetClause(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	@Override
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}

	public boolean isNamed() {
		return named;
	}

	public void setNamed(boolean named) {
		this.named = named;
	}

	@Override
	public String toString() {
		return super.toString() + " (named=" + named + ")";
	}
}

/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
/* Generated By:JJTree: Do not edit this line. ASTPropertyList.java */

package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTPropertyList extends SimpleNode {

	public ASTPropertyList(int id) {
		super(id);
	}

	public ASTPropertyList(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	@Override
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}

	public Node getVerb() {
		return children.get(0);
	}

	public ASTObjectList getObjectList() {
		return (ASTObjectList) children.get(1);
	}

	public ASTPropertyList getNextPropertyList() {
		if (children.size() >= 3) {
			return (ASTPropertyList) children.get(2);
		}
		return null;
	}
}

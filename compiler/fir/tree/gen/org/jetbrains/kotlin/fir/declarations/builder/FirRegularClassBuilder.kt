/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("DuplicatedCode")

package org.jetbrains.kotlin.fir.declarations.builder

import kotlin.contracts.*
import org.jetbrains.kotlin.KtSourceElement
import org.jetbrains.kotlin.descriptors.ClassKind
import org.jetbrains.kotlin.fir.FirModuleData
import org.jetbrains.kotlin.fir.builder.FirAnnotationContainerBuilder
import org.jetbrains.kotlin.fir.builder.FirBuilderDsl
import org.jetbrains.kotlin.fir.declarations.DeprecationsPerUseSite
import org.jetbrains.kotlin.fir.declarations.FirContextReceiver
import org.jetbrains.kotlin.fir.declarations.FirDeclaration
import org.jetbrains.kotlin.fir.declarations.FirDeclarationAttributes
import org.jetbrains.kotlin.fir.declarations.FirDeclarationOrigin
import org.jetbrains.kotlin.fir.declarations.FirDeclarationStatus
import org.jetbrains.kotlin.fir.declarations.FirRegularClass
import org.jetbrains.kotlin.fir.declarations.FirResolvePhase
import org.jetbrains.kotlin.fir.declarations.FirTypeParameterRef
import org.jetbrains.kotlin.fir.declarations.builder.FirClassBuilder
import org.jetbrains.kotlin.fir.declarations.builder.FirTypeParameterRefsOwnerBuilder
import org.jetbrains.kotlin.fir.declarations.impl.FirRegularClassImpl
import org.jetbrains.kotlin.fir.expressions.FirAnnotation
import org.jetbrains.kotlin.fir.references.FirControlFlowGraphReference
import org.jetbrains.kotlin.fir.scopes.FirScopeProvider
import org.jetbrains.kotlin.fir.symbols.impl.FirRegularClassSymbol
import org.jetbrains.kotlin.fir.types.FirTypeRef
import org.jetbrains.kotlin.fir.visitors.*
import org.jetbrains.kotlin.name.Name

/*
 * This file was generated automatically
 * DO NOT MODIFY IT MANUALLY
 */

@FirBuilderDsl
open class FirRegularClassBuilder : FirClassBuilder, FirTypeParameterRefsOwnerBuilder, FirAnnotationContainerBuilder {
    override var source: KtSourceElement? = null
    override lateinit var moduleData: FirModuleData
    override var resolvePhase: FirResolvePhase = FirResolvePhase.RAW_FIR
    override lateinit var origin: FirDeclarationOrigin
    override var attributes: FirDeclarationAttributes = FirDeclarationAttributes()
    override val typeParameters: MutableList<FirTypeParameterRef> = mutableListOf()
    override lateinit var status: FirDeclarationStatus
    override var deprecation: DeprecationsPerUseSite? = null
    override lateinit var classKind: ClassKind
    override val declarations: MutableList<FirDeclaration> = mutableListOf()
    override val annotations: MutableList<FirAnnotation> = mutableListOf()
    override lateinit var scopeProvider: FirScopeProvider
    open lateinit var name: Name
    open lateinit var symbol: FirRegularClassSymbol
    open var companionObjectSymbol: FirRegularClassSymbol? = null
    override val superTypeRefs: MutableList<FirTypeRef> = mutableListOf()
    open val contextReceivers: MutableList<FirContextReceiver> = mutableListOf()

    override fun build(): FirRegularClass {
        return FirRegularClassImpl(
            source,
            moduleData,
            resolvePhase,
            origin,
            attributes,
            typeParameters,
            status,
            deprecation,
            classKind,
            declarations,
            annotations,
            scopeProvider,
            name,
            symbol,
            companionObjectSymbol,
            superTypeRefs,
            contextReceivers,
        )
    }

}

@OptIn(ExperimentalContracts::class)
inline fun buildRegularClass(init: FirRegularClassBuilder.() -> Unit): FirRegularClass {
    contract {
        callsInPlace(init, kotlin.contracts.InvocationKind.EXACTLY_ONCE)
    }
    return FirRegularClassBuilder().apply(init).build()
}

@OptIn(ExperimentalContracts::class)
inline fun buildRegularClassCopy(original: FirRegularClass, init: FirRegularClassBuilder.() -> Unit): FirRegularClass {
    contract {
        callsInPlace(init, kotlin.contracts.InvocationKind.EXACTLY_ONCE)
    }
    val copyBuilder = FirRegularClassBuilder()
    copyBuilder.source = original.source
    copyBuilder.moduleData = original.moduleData
    copyBuilder.resolvePhase = original.resolvePhase
    copyBuilder.origin = original.origin
    copyBuilder.attributes = original.attributes.copy()
    copyBuilder.typeParameters.addAll(original.typeParameters)
    copyBuilder.status = original.status
    copyBuilder.deprecation = original.deprecation
    copyBuilder.classKind = original.classKind
    copyBuilder.declarations.addAll(original.declarations)
    copyBuilder.annotations.addAll(original.annotations)
    copyBuilder.scopeProvider = original.scopeProvider
    copyBuilder.name = original.name
    copyBuilder.symbol = original.symbol
    copyBuilder.companionObjectSymbol = original.companionObjectSymbol
    copyBuilder.superTypeRefs.addAll(original.superTypeRefs)
    copyBuilder.contextReceivers.addAll(original.contextReceivers)
    return copyBuilder.apply(init).build()
}

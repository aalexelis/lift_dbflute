package com.example.dbflute.scala.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean._
import org.seasar.dbflute.cbean.ckey._
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.scala.dbflute.cbean._
import com.example.dbflute.scala.dbflute.cbean.cq.bs._
import com.example.dbflute.scala.dbflute.cbean.cq._

/**
 * The condition-query for in-line of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
class PurchaseCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsPurchaseCQ)
        extends AbstractBsPurchaseCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsPurchaseCQ = null;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    {
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    override protected def reflectRelationOnUnionQuery(bq: ConditionQuery, uq: ConditionQuery): Unit =
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    override protected def setupConditionValueAndRegisterWhereClause(k: ConditionKey, v: Object, cv: ConditionValue, col: String): Unit =
    { regIQ(k, v, cv, col); }

    override protected def setupConditionValueAndRegisterWhereClause(k: ConditionKey, v: Object, cv: ConditionValue, col: String, op: ConditionOption): Unit =
    { regIQ(k, v, cv, col, op); }

    override protected def registerWhereClause(wc: String): Unit =
    { registerInlineWhereClause(wc); }

    override protected def isInScopeRelationSuppressLocalAliasName(): Boolean = {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected def getCValuePurchaseId(): ConditionValue = { return _myCQ.getPurchaseId(); }
    def keepPurchaseId_ExistsReferrer_PurchasePaymentList(sq: PurchasePaymentCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepPurchaseId_NotExistsReferrer_PurchasePaymentList(sq: PurchasePaymentCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepPurchaseId_InScopeRelation_PurchasePaymentList(sq: PurchasePaymentCQ): String =
    { return _myCQ.keepPurchaseId_InScopeRelation_PurchasePaymentList(sq); }
    def keepPurchaseId_NotInScopeRelation_PurchasePaymentList(sq: PurchasePaymentCQ): String =
    { return _myCQ.keepPurchaseId_NotInScopeRelation_PurchasePaymentList(sq); }
    def keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(sq: PurchasePaymentCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(sq: PurchasePaymentCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected def getCValueMemberId(): ConditionValue = { return _myCQ.getMemberId(); }
    protected def getCValueProductId(): ConditionValue = { return _myCQ.getProductId(); }
    protected def getCValuePurchaseDatetime(): ConditionValue = { return _myCQ.getPurchaseDatetime(); }
    protected def getCValuePurchaseCount(): ConditionValue = { return _myCQ.getPurchaseCount(); }
    protected def getCValuePurchasePrice(): ConditionValue = { return _myCQ.getPurchasePrice(); }
    protected def getCValuePaymentCompleteFlg(): ConditionValue = { return _myCQ.getPaymentCompleteFlg(); }
    protected def getCValueRegisterDatetime(): ConditionValue = { return _myCQ.getRegisterDatetime(); }
    protected def getCValueRegisterUser(): ConditionValue = { return _myCQ.getRegisterUser(); }
    protected def getCValueUpdateDatetime(): ConditionValue = { return _myCQ.getUpdateDatetime(); }
    protected def getCValueUpdateUser(): ConditionValue = { return _myCQ.getUpdateUser(); }
    protected def getCValueVersionNo(): ConditionValue = { return _myCQ.getVersionNo(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: PurchaseCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: PurchaseCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: PurchaseCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: PurchaseCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: PurchaseCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[PurchaseCB].getName(); }
    protected def xinCQ(): String = { return classOf[PurchaseCQ].getName(); }
}

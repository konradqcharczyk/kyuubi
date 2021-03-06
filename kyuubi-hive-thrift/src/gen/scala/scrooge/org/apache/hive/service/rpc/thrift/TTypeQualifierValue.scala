/**
 * Generated by Scrooge
 *   version: 19.12.0
 *   rev: dfdb68cf6b9c501dbbe3ae644504bf403ad76bfa
 *   built at: 20191212-171820
 */
package org.apache.hive.service.rpc.thrift

import com.twitter.scrooge.{
  TFieldBlob,
  ThriftStruct,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUnion,
  ThriftUnionFieldInfo,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3}
import org.apache.thrift.protocol._
import scala.collection.immutable.{Map => immutable$Map}

@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
sealed trait TTypeQualifierValue
  extends ThriftUnion
  with ThriftStruct
  with ValidatingThriftStruct[TTypeQualifierValue] {

  def _codec: ValidatingThriftStructCodec3[TTypeQualifierValue] = TTypeQualifierValue
}

private object TTypeQualifierValueDecoder {
  def apply(_iprot: TProtocol, newUnknown: TFieldBlob => TTypeQualifierValue): TTypeQualifierValue = {
    var _result: TTypeQualifierValue = null
    _iprot.readStructBegin()
    val _field = _iprot.readFieldBegin()
    _field.id match {
      case 1 => // i32Value
        _field.`type` match {
          case TType.I32 =>
            _result = TTypeQualifierValue.I32Value({
              _iprot.readI32()
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 2 => // stringValue
        _field.`type` match {
          case TType.STRING =>
            _result = TTypeQualifierValue.StringValue({
              _iprot.readString()
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case _ =>
        if (_field.`type` != TType.STOP) {
          _result = newUnknown(TFieldBlob.read(_field, _iprot))
        } else {
          TProtocolUtil.skip(_iprot, _field.`type`)
        }
    }
    if (_field.`type` != TType.STOP) {
      _iprot.readFieldEnd()
      var _done = false
      var _moreThanOne = false
      while (!_done) {
        val _field = _iprot.readFieldBegin()
        if (_field.`type` == TType.STOP)
          _done = true
        else {
          _moreThanOne = true
          TProtocolUtil.skip(_iprot, _field.`type`)
          _iprot.readFieldEnd()
        }
      }
      if (_moreThanOne) {
        _iprot.readStructEnd()
        throw new TProtocolException("Cannot read a TUnion with more than one set value!")
      }
    }
    _iprot.readStructEnd()
    if (_result == null)
      throw new TProtocolException("Cannot read a TUnion with no set value!")
    _result
  }
}

object TTypeQualifierValueAliases {

  type I32ValueAlias = Int

  def withoutPassthroughFields_I32Value(obj: TTypeQualifierValue.I32Value): TTypeQualifierValue.I32Value = {
    val field = obj.i32Value
    TTypeQualifierValue.I32Value(
      field
    )
  }

  val I32ValueKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val I32ValueValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type StringValueAlias = String

  def withoutPassthroughFields_StringValue(obj: TTypeQualifierValue.StringValue): TTypeQualifierValue.StringValue = {
    val field = obj.stringValue
    TTypeQualifierValue.StringValue(
      field
    )
  }

  val StringValueKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val StringValueValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None
}


@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
object TTypeQualifierValue extends ValidatingThriftStructCodec3[TTypeQualifierValue] {
  val Union: TStruct = new TStruct("TTypeQualifierValue")
  val I32ValueField: TField = new TField("i32Value", TType.I32, 1)
  val I32ValueFieldManifest: Manifest[I32Value] = implicitly[Manifest[I32Value]]
  val StringValueField: TField = new TField("stringValue", TType.STRING, 2)
  val StringValueFieldManifest: Manifest[StringValue] = implicitly[Manifest[StringValue]]

  lazy val structAnnotations: immutable$Map[java.lang.String, java.lang.String] =
    immutable$Map.empty[java.lang.String, java.lang.String]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftUnionFieldInfo[_ <: TTypeQualifierValue, _]] = scala.List(
    new ThriftUnionFieldInfo[I32Value, TTypeQualifierValueAliases.I32ValueAlias](
      I32Value.fieldInfo,
      I32Value.unapply
    ),
    new ThriftUnionFieldInfo[StringValue, TTypeQualifierValueAliases.StringValueAlias](
      StringValue.fieldInfo,
      StringValue.unapply
    )
  )

  override lazy val metaData = new ThriftStructMetaData(
    this,
    Seq(),
    Seq(),
    fieldInfos.asInstanceOf[Seq[ThriftUnionFieldInfo[_root_.com.twitter.scrooge.ThriftUnion with _root_.com.twitter.scrooge.ThriftStruct, _]]],
    structAnnotations)

  override def encode(_item: TTypeQualifierValue, _oprot: TProtocol): Unit =
    _item.write(_oprot)

  override def decode(_iprot: TProtocol): TTypeQualifierValue =
    TTypeQualifierValueDecoder(_iprot, UnknownUnionField(_))

  def apply(_iprot: TProtocol): TTypeQualifierValue = decode(_iprot)

  import TTypeQualifierValueAliases._

  def withoutPassthroughFields(struct: TTypeQualifierValue): TTypeQualifierValue = {
    struct match {
      case obj: I32Value => withoutPassthroughFields_I32Value(obj)
      case obj: StringValue => withoutPassthroughFields_StringValue(obj)
      case unknown: UnknownUnionField => unknown // by definition pass-through
    }
  }

  object I32Value extends (I32ValueAlias => I32Value) {
    def withoutPassthroughFields(obj: I32Value): I32Value =
      withoutPassthroughFields_I32Value(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        I32ValueField,
        false,
        false,
        manifest[I32ValueAlias],
        I32ValueKeyTypeManifest,
        I32ValueValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class I32Value(
      i32Value: I32ValueAlias)
    extends TTypeQualifierValue {

    protected type ContainedType = I32ValueAlias

    def containedValue(): ContainedType = i32Value

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(I32Value.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      _oprot.writeStructBegin(Union)
      if (true) {
        val i32Value_item = i32Value
        _oprot.writeFieldBegin(I32ValueField)
        _oprot.writeI32(i32Value_item)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object StringValue extends (StringValueAlias => StringValue) {
    def withoutPassthroughFields(obj: StringValue): StringValue =
      withoutPassthroughFields_StringValue(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        StringValueField,
        false,
        false,
        manifest[StringValueAlias],
        StringValueKeyTypeManifest,
        StringValueValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class StringValue(
      stringValue: StringValueAlias)
    extends TTypeQualifierValue {

    protected type ContainedType = StringValueAlias

    def containedValue(): ContainedType = stringValue

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(StringValue.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (stringValue == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (stringValue ne null) {
        val stringValue_item = stringValue
        _oprot.writeFieldBegin(StringValueField)
        _oprot.writeString(stringValue_item)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  case class UnknownUnionField private[TTypeQualifierValue](
      field: TFieldBlob)
    extends TTypeQualifierValue {

    protected type ContainedType = Unit

    def containedValue(): ContainedType = ()

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] = _root_.scala.None

    override def write(_oprot: TProtocol): Unit = {
      _oprot.writeStructBegin(Union)
      field.write(_oprot)
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

 /**
  * Checks that the struct is a valid as a new instance. If there are any missing required or
  * construction required fields, return a non-empty list.
  */
  override def validateNewInstance(
    item: TTypeQualifierValue
  ): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    validateField(item.containedValue())
  }
}
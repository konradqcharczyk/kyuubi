/**
 * Generated by Scrooge
 *   version: 19.12.0
 *   rev: dfdb68cf6b9c501dbbe3ae644504bf403ad76bfa
 *   built at: 20191212-171820
 */
package org.apache.hive.service.rpc.thrift

import com.twitter.io.Buf
import com.twitter.scrooge.{
  InvalidFieldsException,
  LazyTProtocol,
  StructBuilder,
  StructBuilderFactory,
  TFieldBlob,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructField,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.TMemoryBuffer
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.reflect.{ClassTag, classTag}


object TColumnDesc extends ValidatingThriftStructCodec3[TColumnDesc] with StructBuilderFactory[TColumnDesc] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("TColumnDesc")
  val ColumnNameField: TField = new TField("columnName", TType.STRING, 1)
  val ColumnNameFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val TypeDescField: TField = new TField("typeDesc", TType.STRUCT, 2)
  val TypeDescFieldManifest: Manifest[org.apache.hive.service.rpc.thrift.TTypeDesc] = implicitly[Manifest[org.apache.hive.service.rpc.thrift.TTypeDesc]]
  val PositionField: TField = new TField("position", TType.I32, 3)
  val PositionFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]
  val CommentField: TField = new TField("comment", TType.STRING, 4)
  val CommentFieldManifest: Manifest[String] = implicitly[Manifest[String]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      ColumnNameField,
      false,
      true,
      ColumnNameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      TypeDescField,
      false,
      true,
      TypeDescFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      PositionField,
      false,
      true,
      PositionFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      CommentField,
      true,
      false,
      CommentFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  private val fieldTypes: IndexedSeq[ClassTag[_]] = IndexedSeq(
    classTag[String].asInstanceOf[ClassTag[_]],
    classTag[org.apache.hive.service.rpc.thrift.TTypeDesc].asInstanceOf[ClassTag[_]],
    classTag[Int].asInstanceOf[ClassTag[_]],
    classTag[_root_.scala.Option[String]].asInstanceOf[ClassTag[_]]
  )

  private[this] val structFields: Seq[ThriftStructField[TColumnDesc]] = {
    Seq(
      new ThriftStructField[TColumnDesc](
        ColumnNameField,
        _root_.scala.Some(ColumnNameFieldManifest),
        classOf[TColumnDesc]) {
          def getValue[R](struct: TColumnDesc): R = struct.columnName.asInstanceOf[R]
      },
      new ThriftStructField[TColumnDesc](
        TypeDescField,
        _root_.scala.Some(TypeDescFieldManifest),
        classOf[TColumnDesc]) {
          def getValue[R](struct: TColumnDesc): R = struct.typeDesc.asInstanceOf[R]
      },
      new ThriftStructField[TColumnDesc](
        PositionField,
        _root_.scala.Some(PositionFieldManifest),
        classOf[TColumnDesc]) {
          def getValue[R](struct: TColumnDesc): R = struct.position.asInstanceOf[R]
      },
      new ThriftStructField[TColumnDesc](
        CommentField,
        _root_.scala.Some(CommentFieldManifest),
        classOf[TColumnDesc]) {
          def getValue[R](struct: TColumnDesc): R = struct.comment.asInstanceOf[R]
      }
    )
  }

  override lazy val metaData: ThriftStructMetaData[TColumnDesc] =
    new ThriftStructMetaData(this, structFields, fieldInfos, Seq(), structAnnotations)

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: TColumnDesc): Unit = {
    if (_item.columnName == null) throw new TProtocolException("Required field columnName cannot be null")
    if (_item.typeDesc == null) throw new TProtocolException("Required field typeDesc cannot be null")
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: TColumnDesc): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    if (item.columnName == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(0))
    buf ++= validateField(item.columnName)
    if (item.typeDesc == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(1))
    buf ++= validateField(item.typeDesc)
    buf ++= validateField(item.position)
    buf ++= validateField(item.comment)
    buf.toList
  }

  def withoutPassthroughFields(original: TColumnDesc): TColumnDesc =
    new Immutable(
      columnName =
        {
          val field = original.columnName
          field
        },
      typeDesc =
        {
          val field = original.typeDesc
          org.apache.hive.service.rpc.thrift.TTypeDesc.withoutPassthroughFields(field)
        },
      position =
        {
          val field = original.position
          field
        },
      comment =
        {
          val field = original.comment
          field.map { field =>
            field
          }
        }
    )

  def newBuilder(): StructBuilder[TColumnDesc] = new TColumnDescStructBuilder(_root_.scala.None, fieldTypes)

  override def encode(_item: TColumnDesc, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): TColumnDesc = {

    var columnNameOffset: Int = -1
    var _got_columnName = false
    var typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc = null
    var _got_typeDesc = false
    var position: Int = 0
    var _got_position = false
    var commentOffset: Int = -1

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                columnNameOffset = _iprot.offsetSkipString
    
                _got_columnName = true
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'columnName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                typeDesc = readTypeDescValue(_iprot)
                _got_typeDesc = true
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'typeDesc' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 =>
    
                position = readPositionValue(_iprot)
                _got_position = true
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'position' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                commentOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'comment' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    if (!_got_columnName) throw new TProtocolException("Required field 'columnName' was not found in serialized data for struct TColumnDesc")
    if (!_got_typeDesc) throw new TProtocolException("Required field 'typeDesc' was not found in serialized data for struct TColumnDesc")
    if (!_got_position) throw new TProtocolException("Required field 'position' was not found in serialized data for struct TColumnDesc")
    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      columnNameOffset,
      typeDesc,
      position,
      commentOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): TColumnDesc =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[thrift] def eagerDecode(_iprot: TProtocol): TColumnDesc = {
    var columnName: String = null
    var _got_columnName = false
    var typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc = null
    var _got_typeDesc = false
    var position: Int = 0
    var _got_position = false
    var comment: _root_.scala.Option[String] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                columnName = readColumnNameValue(_iprot)
                _got_columnName = true
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'columnName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
                typeDesc = readTypeDescValue(_iprot)
                _got_typeDesc = true
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'typeDesc' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 =>
                position = readPositionValue(_iprot)
                _got_position = true
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'position' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                comment = _root_.scala.Some(readCommentValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'comment' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    if (!_got_columnName) throw new TProtocolException("Required field 'columnName' was not found in serialized data for struct TColumnDesc")
    if (!_got_typeDesc) throw new TProtocolException("Required field 'typeDesc' was not found in serialized data for struct TColumnDesc")
    if (!_got_position) throw new TProtocolException("Required field 'position' was not found in serialized data for struct TColumnDesc")
    new Immutable(
      columnName,
      typeDesc,
      position,
      comment,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    columnName: String,
    typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc,
    position: Int,
    comment: _root_.scala.Option[String] = _root_.scala.None
  ): TColumnDesc =
    new Immutable(
      columnName,
      typeDesc,
      position,
      comment
    )

  def unapply(_item: TColumnDesc): _root_.scala.Option[_root_.scala.Tuple4[String, org.apache.hive.service.rpc.thrift.TTypeDesc, Int, Option[String]]] = _root_.scala.Some(_item.toTuple)


  @inline private[thrift] def readColumnNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeColumnNameField(columnName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ColumnNameField)
    writeColumnNameValue(columnName_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeColumnNameValue(columnName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(columnName_item)
  }

  @inline private[thrift] def readTypeDescValue(_iprot: TProtocol): org.apache.hive.service.rpc.thrift.TTypeDesc = {
    org.apache.hive.service.rpc.thrift.TTypeDesc.decode(_iprot)
  }

  @inline private def writeTypeDescField(typeDesc_item: org.apache.hive.service.rpc.thrift.TTypeDesc, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TypeDescField)
    writeTypeDescValue(typeDesc_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTypeDescValue(typeDesc_item: org.apache.hive.service.rpc.thrift.TTypeDesc, _oprot: TProtocol): Unit = {
    typeDesc_item.write(_oprot)
  }

  @inline private[thrift] def readPositionValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writePositionField(position_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PositionField)
    writePositionValue(position_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePositionValue(position_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(position_item)
  }

  @inline private[thrift] def readCommentValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeCommentField(comment_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(CommentField)
    writeCommentValue(comment_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeCommentValue(comment_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(comment_item)
  }


  object Immutable extends ThriftStructCodec3[TColumnDesc] {
    override def encode(_item: TColumnDesc, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): TColumnDesc = TColumnDesc.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[TColumnDesc] = TColumnDesc.metaData
  }

  /**
   * The default read-only implementation of TColumnDesc.  You typically should not need to
   * directly reference this class; instead, use the TColumnDesc.apply method to construct
   * new instances.
   */
  class Immutable(
      val columnName: String,
      val typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc,
      val position: Int,
      val comment: _root_.scala.Option[String],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TColumnDesc {
    def this(
      columnName: String,
      typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc,
      position: Int,
      comment: _root_.scala.Option[String] = _root_.scala.None
    ) = this(
      columnName,
      typeDesc,
      position,
      comment,
      immutable$Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      columnNameOffset: Int,
      val typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc,
      val position: Int,
      commentOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TColumnDesc {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val columnName: String =
      if (columnNameOffset == -1)
        null
      else {
        _proto.decodeString(_buf, columnNameOffset)
      }
    lazy val comment: _root_.scala.Option[String] =
      if (commentOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, commentOffset))
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the TColumnDesc trait with additional state or
   * behavior and implement the read-only methods from TColumnDesc using an underlying
   * instance.
   */
  trait Proxy extends TColumnDesc {
    protected def _underlying_TColumnDesc: TColumnDesc
    override def columnName: String = _underlying_TColumnDesc.columnName
    override def typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc = _underlying_TColumnDesc.typeDesc
    override def position: Int = _underlying_TColumnDesc.position
    override def comment: _root_.scala.Option[String] = _underlying_TColumnDesc.comment
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_TColumnDesc._passthroughFields
  }
}

/**
 * Prefer the companion object's [[org.apache.hive.service.rpc.thrift.TColumnDesc.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait TColumnDesc
  extends ThriftStruct
  with _root_.scala.Product4[String, org.apache.hive.service.rpc.thrift.TTypeDesc, Int, Option[String]]
  with ValidatingThriftStruct[TColumnDesc]
  with java.io.Serializable
{
  import TColumnDesc._

  def columnName: String
  def typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc
  def position: Int
  def comment: _root_.scala.Option[String]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: String = columnName
  def _2: org.apache.hive.service.rpc.thrift.TTypeDesc = typeDesc
  def _3: Int = position
  def _4: _root_.scala.Option[String] = comment

  def toTuple: _root_.scala.Tuple4[String, org.apache.hive.service.rpc.thrift.TTypeDesc, Int, Option[String]] = {
    (
      columnName,
      typeDesc,
      position,
      comment
    )
  }


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (columnName ne null) {
                writeColumnNameValue(columnName, _oprot)
                _root_.scala.Some(TColumnDesc.ColumnNameField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (typeDesc ne null) {
                writeTypeDescValue(typeDesc, _oprot)
                _root_.scala.Some(TColumnDesc.TypeDescField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (true) {
                writePositionValue(position, _oprot)
                _root_.scala.Some(TColumnDesc.PositionField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (comment.isDefined) {
                writeCommentValue(comment.get, _oprot)
                _root_.scala.Some(TColumnDesc.CommentField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): TColumnDesc = {
    var columnName: String = this.columnName
    var typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc = this.typeDesc
    var position: Int = this.position
    var comment: _root_.scala.Option[String] = this.comment
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        columnName = readColumnNameValue(_blob.read)
      case 2 =>
        typeDesc = readTypeDescValue(_blob.read)
      case 3 =>
        position = readPositionValue(_blob.read)
      case 4 =>
        comment = _root_.scala.Some(readCommentValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      columnName,
      typeDesc,
      position,
      comment,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): TColumnDesc = {
    var columnName: String = this.columnName
    var typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc = this.typeDesc
    var position: Int = this.position
    var comment: _root_.scala.Option[String] = this.comment

    _fieldId match {
      case 1 =>
        columnName = null
      case 2 =>
        typeDesc = null
      case 3 =>
        position = 0
      case 4 =>
        comment = _root_.scala.None
      case _ =>
    }
    new Immutable(
      columnName,
      typeDesc,
      position,
      comment,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetColumnName: TColumnDesc = unsetField(1)

  def unsetTypeDesc: TColumnDesc = unsetField(2)

  def unsetPosition: TColumnDesc = unsetField(3)

  def unsetComment: TColumnDesc = unsetField(4)


  override def write(_oprot: TProtocol): Unit = {
    TColumnDesc.validate(this)
    _oprot.writeStructBegin(Struct)
    if (columnName ne null) writeColumnNameField(columnName, _oprot)
    if (typeDesc ne null) writeTypeDescField(typeDesc, _oprot)
    writePositionField(position, _oprot)
    if (comment.isDefined) writeCommentField(comment.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    columnName: String = this.columnName,
    typeDesc: org.apache.hive.service.rpc.thrift.TTypeDesc = this.typeDesc,
    position: Int = this.position,
    comment: _root_.scala.Option[String] = this.comment,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): TColumnDesc =
    new Immutable(
      columnName,
      typeDesc,
      position,
      comment,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[TColumnDesc]

  private def _equals(x: TColumnDesc, y: TColumnDesc): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[TColumnDesc])

  override def hashCode: Int = {
    _root_.scala.runtime.ScalaRunTime._hashCode(this)
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 4

  override def productElement(n: Int): Any = n match {
    case 0 => this.columnName
    case 1 => this.typeDesc
    case 2 => this.position
    case 3 => this.comment
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "TColumnDesc"

  def _codec: ValidatingThriftStructCodec3[TColumnDesc] = TColumnDesc

  def newBuilder(): StructBuilder[TColumnDesc] = new TColumnDescStructBuilder(_root_.scala.Some(this), fieldTypes)
}

private[thrift] class TColumnDescStructBuilder(instance: _root_.scala.Option[TColumnDesc], fieldTypes: IndexedSeq[ClassTag[_]])
    extends StructBuilder[TColumnDesc](fieldTypes) {

  def build(): TColumnDesc = instance match {
    case _root_.scala.Some(i) =>
      TColumnDesc(
        (if (fieldArray(0) == null) i.columnName else fieldArray(0)).asInstanceOf[String],
        (if (fieldArray(1) == null) i.typeDesc else fieldArray(1)).asInstanceOf[org.apache.hive.service.rpc.thrift.TTypeDesc],
        (if (fieldArray(2) == null) i.position else fieldArray(2)).asInstanceOf[Int],
        (if (fieldArray(3) == null) i.comment else fieldArray(3)).asInstanceOf[_root_.scala.Option[String]]
      )
    case _root_.scala.None =>
      if (fieldArray.contains(null)) throw new InvalidFieldsException(structBuildError("TColumnDesc"))
      else {
        TColumnDesc(
          fieldArray(0).asInstanceOf[String],
          fieldArray(1).asInstanceOf[org.apache.hive.service.rpc.thrift.TTypeDesc],
          fieldArray(2).asInstanceOf[Int],
          fieldArray(3).asInstanceOf[_root_.scala.Option[String]]
        )
      }
    }
}

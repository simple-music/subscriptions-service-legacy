package ru.bmstu.iu7.simplemusic.subscriptionsservice.exception

open class ServiceException(message: String?) : RuntimeException(message)

class NotFoundException(message: String?) : ServiceException(message)

class ValidationException(message: String?) : ServiceException(message)

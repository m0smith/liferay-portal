/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.journal.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.TunnelUtil;

import com.liferay.portlet.journal.service.JournalArticleServiceUtil;

/**
 * <p>
 * This class provides a HTTP utility for the
 * {@link com.liferay.portlet.journal.service.JournalArticleServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link com.liferay.portal.security.auth.HttpPrincipal} parameter.
 * </p>
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JournalArticleServiceSoap
 * @see       com.liferay.portal.security.auth.HttpPrincipal
 * @see       com.liferay.portlet.journal.service.JournalArticleServiceUtil
 * @generated
 */
public class JournalArticleServiceHttp {
	public static com.liferay.portlet.journal.model.JournalArticle addArticle(
		HttpPrincipal httpPrincipal, long groupId, long folderId,
		long classNameId, long classPK, java.lang.String articleId,
		boolean autoArticleId,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.lang.String content, java.lang.String type,
		java.lang.String structureId, java.lang.String templateId,
		java.lang.String layoutUuid, int displayDateMonth, int displayDateDay,
		int displayDateYear, int displayDateHour, int displayDateMinute,
		int expirationDateMonth, int expirationDateDay, int expirationDateYear,
		int expirationDateHour, int expirationDateMinute, boolean neverExpire,
		int reviewDateMonth, int reviewDateDay, int reviewDateYear,
		int reviewDateHour, int reviewDateMinute, boolean neverReview,
		boolean indexable, boolean smallImage, java.lang.String smallImageURL,
		java.io.File smallFile, java.util.Map<java.lang.String, byte[]> images,
		java.lang.String articleURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"addArticle", _addArticleParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					folderId, classNameId, classPK, articleId, autoArticleId,
					titleMap, descriptionMap, content, type, structureId,
					templateId, layoutUuid, displayDateMonth, displayDateDay,
					displayDateYear, displayDateHour, displayDateMinute,
					expirationDateMonth, expirationDateDay, expirationDateYear,
					expirationDateHour, expirationDateMinute, neverExpire,
					reviewDateMonth, reviewDateDay, reviewDateYear,
					reviewDateHour, reviewDateMinute, neverReview, indexable,
					smallImage, smallImageURL, smallFile, images, articleURL,
					serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle addArticle(
		HttpPrincipal httpPrincipal, long groupId, long folderId,
		long classNameId, long classPK, java.lang.String articleId,
		boolean autoArticleId,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.lang.String content, java.lang.String type,
		java.lang.String structureId, java.lang.String templateId,
		java.lang.String layoutUuid, int displayDateMonth, int displayDateDay,
		int displayDateYear, int displayDateHour, int displayDateMinute,
		int expirationDateMonth, int expirationDateDay, int expirationDateYear,
		int expirationDateHour, int expirationDateMinute, boolean neverExpire,
		int reviewDateMonth, int reviewDateDay, int reviewDateYear,
		int reviewDateHour, int reviewDateMinute, boolean neverReview,
		boolean indexable, java.lang.String articleURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"addArticle", _addArticleParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					folderId, classNameId, classPK, articleId, autoArticleId,
					titleMap, descriptionMap, content, type, structureId,
					templateId, layoutUuid, displayDateMonth, displayDateDay,
					displayDateYear, displayDateHour, displayDateMinute,
					expirationDateMonth, expirationDateDay, expirationDateYear,
					expirationDateHour, expirationDateMinute, neverExpire,
					reviewDateMonth, reviewDateDay, reviewDateYear,
					reviewDateHour, reviewDateMinute, neverReview, indexable,
					articleURL, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle copyArticle(
		HttpPrincipal httpPrincipal, long groupId,
		java.lang.String oldArticleId, java.lang.String newArticleId,
		boolean autoArticleId, double version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"copyArticle", _copyArticleParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					oldArticleId, newArticleId, autoArticleId, version);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteArticle(HttpPrincipal httpPrincipal, long groupId,
		java.lang.String articleId, double version,
		java.lang.String articleURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"deleteArticle", _deleteArticleParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, version, articleURL, serviceContext);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteArticle(HttpPrincipal httpPrincipal, long groupId,
		java.lang.String articleId, java.lang.String articleURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"deleteArticle", _deleteArticleParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, articleURL, serviceContext);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle expireArticle(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		double version, java.lang.String articleURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"expireArticle", _expireArticleParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, version, articleURL, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void expireArticle(HttpPrincipal httpPrincipal, long groupId,
		java.lang.String articleId, java.lang.String articleURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"expireArticle", _expireArticleParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, articleURL, serviceContext);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getArticle(
		HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticle", _getArticleParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getArticle(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticle", _getArticleParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getArticle(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		double version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticle", _getArticleParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, version);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getArticle(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String className,
		long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticle", _getArticleParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					className, classPK);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getArticleByUrlTitle(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String urlTitle)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticleByUrlTitle",
					_getArticleByUrlTitleParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					urlTitle);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String getArticleContent(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		double version, java.lang.String languageId,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticleContent", _getArticleContentParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, version, languageId, themeDisplay);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String getArticleContent(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		java.lang.String languageId,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticleContent", _getArticleContentParameterTypes13);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, languageId, themeDisplay);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> getArticles(
		HttpPrincipal httpPrincipal, long groupId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticles", _getArticlesParameterTypes14);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					folderId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> getArticles(
		HttpPrincipal httpPrincipal, long groupId, long folderId, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticles", _getArticlesParameterTypes15);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					folderId, start, end, obc);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> getArticlesByArticleId(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticlesByArticleId",
					_getArticlesByArticleIdParameterTypes16);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, start, end, obc);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> getArticlesByLayoutUuid(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String layoutUuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticlesByLayoutUuid",
					_getArticlesByLayoutUuidParameterTypes17);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					layoutUuid);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> getArticlesByStructureId(
		HttpPrincipal httpPrincipal, long groupId,
		java.lang.String structureId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticlesByStructureId",
					_getArticlesByStructureIdParameterTypes18);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					structureId, start, end, obc);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> getArticlesByUserId(
		HttpPrincipal httpPrincipal, long groupId, long userId, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticlesByUserId", _getArticlesByUserIdParameterTypes19);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					userId, start, end, obc);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getArticlesCount(HttpPrincipal httpPrincipal,
		long groupId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticlesCount", _getArticlesCountParameterTypes20);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					folderId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getArticlesCountByArticleId(HttpPrincipal httpPrincipal,
		long groupId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticlesCountByArticleId",
					_getArticlesCountByArticleIdParameterTypes21);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getArticlesCountByStructureId(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String structureId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticlesCountByStructureId",
					_getArticlesCountByStructureIdParameterTypes22);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					structureId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getArticlesCountByUserId(HttpPrincipal httpPrincipal,
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getArticlesCountByUserId",
					_getArticlesCountByUserIdParameterTypes23);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getDisplayArticleByUrlTitle(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String urlTitle)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getDisplayArticleByUrlTitle",
					_getDisplayArticleByUrlTitleParameterTypes24);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					urlTitle);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getFoldersAndArticlesCount(HttpPrincipal httpPrincipal,
		long groupId, java.util.List<java.lang.Long> folderIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getFoldersAndArticlesCount",
					_getFoldersAndArticlesCountParameterTypes25);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					folderIds);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getLatestArticle(
		HttpPrincipal httpPrincipal, long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getLatestArticle", _getLatestArticleParameterTypes26);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					resourcePrimKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getLatestArticle(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getLatestArticle", _getLatestArticleParameterTypes27);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, status);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle getLatestArticle(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String className,
		long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"getLatestArticle", _getLatestArticleParameterTypes28);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					className, classPK);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void removeArticleLocale(HttpPrincipal httpPrincipal,
		long companyId, java.lang.String languageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"removeArticleLocale", _removeArticleLocaleParameterTypes29);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, languageId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle removeArticleLocale(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		double version, java.lang.String languageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"removeArticleLocale", _removeArticleLocaleParameterTypes30);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, version, languageId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> search(
		HttpPrincipal httpPrincipal, long companyId, long groupId,
		long folderId, long classNameId, java.lang.String keywords,
		java.lang.Double version, java.lang.String type,
		java.lang.String structureId, java.lang.String templateId,
		java.util.Date displayDateGT, java.util.Date displayDateLT, int status,
		java.util.Date reviewDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"search", _searchParameterTypes31);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, groupId, folderId, classNameId, keywords,
					version, type, structureId, templateId, displayDateGT,
					displayDateLT, status, reviewDate, start, end, obc);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> search(
		HttpPrincipal httpPrincipal, long companyId, long groupId,
		long folderId, long classNameId, java.lang.String articleId,
		java.lang.Double version, java.lang.String title,
		java.lang.String description, java.lang.String content,
		java.lang.String type, java.lang.String structureId,
		java.lang.String templateId, java.util.Date displayDateGT,
		java.util.Date displayDateLT, int status, java.util.Date reviewDate,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"search", _searchParameterTypes32);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, groupId, folderId, classNameId, articleId,
					version, title, description, content, type, structureId,
					templateId, displayDateGT, displayDateLT, status,
					reviewDate, andOperator, start, end, obc);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.journal.model.JournalArticle> search(
		HttpPrincipal httpPrincipal, long companyId, long groupId,
		long folderId, long classNameId, java.lang.String articleId,
		java.lang.Double version, java.lang.String title,
		java.lang.String description, java.lang.String content,
		java.lang.String type, java.lang.String[] structureIds,
		java.lang.String[] templateIds, java.util.Date displayDateGT,
		java.util.Date displayDateLT, int status, java.util.Date reviewDate,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"search", _searchParameterTypes33);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, groupId, folderId, classNameId, articleId,
					version, title, description, content, type, structureIds,
					templateIds, displayDateGT, displayDateLT, status,
					reviewDate, andOperator, start, end, obc);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.journal.model.JournalArticle>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int searchCount(HttpPrincipal httpPrincipal, long companyId,
		long groupId, long folderId, long classNameId,
		java.lang.String keywords, java.lang.Double version,
		java.lang.String type, java.lang.String structureId,
		java.lang.String templateId, java.util.Date displayDateGT,
		java.util.Date displayDateLT, int status, java.util.Date reviewDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"searchCount", _searchCountParameterTypes34);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, groupId, folderId, classNameId, keywords,
					version, type, structureId, templateId, displayDateGT,
					displayDateLT, status, reviewDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int searchCount(HttpPrincipal httpPrincipal, long companyId,
		long groupId, long folderId, long classNameId,
		java.lang.String articleId, java.lang.Double version,
		java.lang.String title, java.lang.String description,
		java.lang.String content, java.lang.String type,
		java.lang.String structureId, java.lang.String templateId,
		java.util.Date displayDateGT, java.util.Date displayDateLT, int status,
		java.util.Date reviewDate, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"searchCount", _searchCountParameterTypes35);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, groupId, folderId, classNameId, articleId,
					version, title, description, content, type, structureId,
					templateId, displayDateGT, displayDateLT, status,
					reviewDate, andOperator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int searchCount(HttpPrincipal httpPrincipal, long companyId,
		long groupId, long folderId, long classNameId,
		java.lang.String articleId, java.lang.Double version,
		java.lang.String title, java.lang.String description,
		java.lang.String content, java.lang.String type,
		java.lang.String[] structureIds, java.lang.String[] templateIds,
		java.util.Date displayDateGT, java.util.Date displayDateLT, int status,
		java.util.Date reviewDate, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"searchCount", _searchCountParameterTypes36);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, groupId, folderId, classNameId, articleId,
					version, title, description, content, type, structureIds,
					templateIds, displayDateGT, displayDateLT, status,
					reviewDate, andOperator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void subscribe(HttpPrincipal httpPrincipal, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"subscribe", _subscribeParameterTypes37);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void unsubscribe(HttpPrincipal httpPrincipal, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"unsubscribe", _unsubscribeParameterTypes38);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle updateArticle(
		HttpPrincipal httpPrincipal, long userId, long groupId, long folderId,
		java.lang.String articleId, double version,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.lang.String content, java.lang.String layoutUuid,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"updateArticle", _updateArticleParameterTypes39);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					groupId, folderId, articleId, version, titleMap,
					descriptionMap, content, layoutUuid, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle updateArticle(
		HttpPrincipal httpPrincipal, long groupId, long folderId,
		java.lang.String articleId, double version,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.lang.String content, java.lang.String type,
		java.lang.String structureId, java.lang.String templateId,
		java.lang.String layoutUuid, int displayDateMonth, int displayDateDay,
		int displayDateYear, int displayDateHour, int displayDateMinute,
		int expirationDateMonth, int expirationDateDay, int expirationDateYear,
		int expirationDateHour, int expirationDateMinute, boolean neverExpire,
		int reviewDateMonth, int reviewDateDay, int reviewDateYear,
		int reviewDateHour, int reviewDateMinute, boolean neverReview,
		boolean indexable, boolean smallImage, java.lang.String smallImageURL,
		java.io.File smallFile, java.util.Map<java.lang.String, byte[]> images,
		java.lang.String articleURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"updateArticle", _updateArticleParameterTypes40);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					folderId, articleId, version, titleMap, descriptionMap,
					content, type, structureId, templateId, layoutUuid,
					displayDateMonth, displayDateDay, displayDateYear,
					displayDateHour, displayDateMinute, expirationDateMonth,
					expirationDateDay, expirationDateYear, expirationDateHour,
					expirationDateMinute, neverExpire, reviewDateMonth,
					reviewDateDay, reviewDateYear, reviewDateHour,
					reviewDateMinute, neverReview, indexable, smallImage,
					smallImageURL, smallFile, images, articleURL, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle updateArticle(
		HttpPrincipal httpPrincipal, long groupId, long folderId,
		java.lang.String articleId, double version, java.lang.String content,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"updateArticle", _updateArticleParameterTypes41);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					folderId, articleId, version, content, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle updateArticleTranslation(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		double version, java.util.Locale locale, java.lang.String title,
		java.lang.String description, java.lang.String content,
		java.util.Map<java.lang.String, byte[]> images)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"updateArticleTranslation",
					_updateArticleTranslationParameterTypes42);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, version, locale, title, description, content,
					images);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle updateArticleTranslation(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		double version, java.util.Locale locale, java.lang.String title,
		java.lang.String description, java.lang.String content,
		java.util.Map<java.lang.String, byte[]> images,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"updateArticleTranslation",
					_updateArticleTranslationParameterTypes43);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, version, locale, title, description, content,
					images, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.journal.model.JournalArticle updateContent(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String articleId,
		double version, java.lang.String content)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(JournalArticleServiceUtil.class.getName(),
					"updateContent", _updateContentParameterTypes44);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					articleId, version, content);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portlet.journal.model.JournalArticle)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(JournalArticleServiceHttp.class);
	private static final Class<?>[] _addArticleParameterTypes0 = new Class[] {
			long.class, long.class, long.class, long.class,
			java.lang.String.class, boolean.class, java.util.Map.class,
			java.util.Map.class, java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, int.class, int.class, int.class,
			int.class, int.class, int.class, int.class, int.class, int.class,
			boolean.class, int.class, int.class, int.class, int.class, int.class,
			boolean.class, boolean.class, boolean.class, java.lang.String.class,
			java.io.File.class, java.util.Map.class, java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _addArticleParameterTypes1 = new Class[] {
			long.class, long.class, long.class, long.class,
			java.lang.String.class, boolean.class, java.util.Map.class,
			java.util.Map.class, java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, int.class, int.class, int.class,
			int.class, int.class, int.class, int.class, int.class, int.class,
			boolean.class, int.class, int.class, int.class, int.class, int.class,
			boolean.class, boolean.class, java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _copyArticleParameterTypes2 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			boolean.class, double.class
		};
	private static final Class<?>[] _deleteArticleParameterTypes3 = new Class[] {
			long.class, java.lang.String.class, double.class,
			java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteArticleParameterTypes4 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _expireArticleParameterTypes5 = new Class[] {
			long.class, java.lang.String.class, double.class,
			java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _expireArticleParameterTypes6 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _getArticleParameterTypes7 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getArticleParameterTypes8 = new Class[] {
			long.class, java.lang.String.class
		};
	private static final Class<?>[] _getArticleParameterTypes9 = new Class[] {
			long.class, java.lang.String.class, double.class
		};
	private static final Class<?>[] _getArticleParameterTypes10 = new Class[] {
			long.class, java.lang.String.class, long.class
		};
	private static final Class<?>[] _getArticleByUrlTitleParameterTypes11 = new Class[] {
			long.class, java.lang.String.class
		};
	private static final Class<?>[] _getArticleContentParameterTypes12 = new Class[] {
			long.class, java.lang.String.class, double.class,
			java.lang.String.class, com.liferay.portal.theme.ThemeDisplay.class
		};
	private static final Class<?>[] _getArticleContentParameterTypes13 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			com.liferay.portal.theme.ThemeDisplay.class
		};
	private static final Class<?>[] _getArticlesParameterTypes14 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _getArticlesParameterTypes15 = new Class[] {
			long.class, long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getArticlesByArticleIdParameterTypes16 = new Class[] {
			long.class, java.lang.String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getArticlesByLayoutUuidParameterTypes17 = new Class[] {
			long.class, java.lang.String.class
		};
	private static final Class<?>[] _getArticlesByStructureIdParameterTypes18 = new Class[] {
			long.class, java.lang.String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getArticlesByUserIdParameterTypes19 = new Class[] {
			long.class, long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getArticlesCountParameterTypes20 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _getArticlesCountByArticleIdParameterTypes21 =
		new Class[] { long.class, java.lang.String.class };
	private static final Class<?>[] _getArticlesCountByStructureIdParameterTypes22 =
		new Class[] { long.class, java.lang.String.class };
	private static final Class<?>[] _getArticlesCountByUserIdParameterTypes23 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _getDisplayArticleByUrlTitleParameterTypes24 =
		new Class[] { long.class, java.lang.String.class };
	private static final Class<?>[] _getFoldersAndArticlesCountParameterTypes25 = new Class[] {
			long.class, java.util.List.class
		};
	private static final Class<?>[] _getLatestArticleParameterTypes26 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getLatestArticleParameterTypes27 = new Class[] {
			long.class, java.lang.String.class, int.class
		};
	private static final Class<?>[] _getLatestArticleParameterTypes28 = new Class[] {
			long.class, java.lang.String.class, long.class
		};
	private static final Class<?>[] _removeArticleLocaleParameterTypes29 = new Class[] {
			long.class, java.lang.String.class
		};
	private static final Class<?>[] _removeArticleLocaleParameterTypes30 = new Class[] {
			long.class, java.lang.String.class, double.class,
			java.lang.String.class
		};
	private static final Class<?>[] _searchParameterTypes31 = new Class[] {
			long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.Double.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			int.class, java.util.Date.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchParameterTypes32 = new Class[] {
			long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.Double.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, java.util.Date.class,
			java.util.Date.class, int.class, java.util.Date.class, boolean.class,
			int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchParameterTypes33 = new Class[] {
			long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.Double.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String[].class, java.lang.String[].class,
			java.util.Date.class, java.util.Date.class, int.class,
			java.util.Date.class, boolean.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchCountParameterTypes34 = new Class[] {
			long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.Double.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			int.class, java.util.Date.class
		};
	private static final Class<?>[] _searchCountParameterTypes35 = new Class[] {
			long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.Double.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, java.util.Date.class,
			java.util.Date.class, int.class, java.util.Date.class, boolean.class
		};
	private static final Class<?>[] _searchCountParameterTypes36 = new Class[] {
			long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.Double.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String[].class, java.lang.String[].class,
			java.util.Date.class, java.util.Date.class, int.class,
			java.util.Date.class, boolean.class
		};
	private static final Class<?>[] _subscribeParameterTypes37 = new Class[] {
			long.class
		};
	private static final Class<?>[] _unsubscribeParameterTypes38 = new Class[] {
			long.class
		};
	private static final Class<?>[] _updateArticleParameterTypes39 = new Class[] {
			long.class, long.class, long.class, java.lang.String.class,
			double.class, java.util.Map.class, java.util.Map.class,
			java.lang.String.class, java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _updateArticleParameterTypes40 = new Class[] {
			long.class, long.class, java.lang.String.class, double.class,
			java.util.Map.class, java.util.Map.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, int.class, int.class,
			int.class, int.class, int.class, int.class, int.class, int.class,
			int.class, int.class, boolean.class, int.class, int.class, int.class,
			int.class, int.class, boolean.class, boolean.class, boolean.class,
			java.lang.String.class, java.io.File.class, java.util.Map.class,
			java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _updateArticleParameterTypes41 = new Class[] {
			long.class, long.class, java.lang.String.class, double.class,
			java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _updateArticleTranslationParameterTypes42 = new Class[] {
			long.class, java.lang.String.class, double.class,
			java.util.Locale.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, java.util.Map.class
		};
	private static final Class<?>[] _updateArticleTranslationParameterTypes43 = new Class[] {
			long.class, java.lang.String.class, double.class,
			java.util.Locale.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, java.util.Map.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _updateContentParameterTypes44 = new Class[] {
			long.class, java.lang.String.class, double.class,
			java.lang.String.class
		};
}
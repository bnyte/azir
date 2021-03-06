// @ts-ignore
/* eslint-disable */

declare namespace API {

  /** 响应结果 */
  type R<T> = {
    code?: number;
    message?: string;
    status?: boolean;
    data?: T;
  };

  /** 路由 */
  type Menu = {
    id: number;
    parentId?: number | string;
    menu: string;
    name: string;
    icon: string;
    gmtCreate: string;
    path: string;
    weights: weights;
    children: Menu[];
    verify: boolean;
  };

  /* 查询参数 */
  type PageSearch<T> = {
    current: number;
    pageSize: number;
    optional: T;
  }

  /** 用户 */
  type User = {
    id?: number;
    account?: string;
    username?: string;
    avatar?: string;
    admin?: boolean;
  };

  type CurrentUser = {
    username?: string;
    avatar?: string;
    admin?: boolean;
    userid?: string;
    email?: string;
    signature?: string;
    title?: string;
    group?: string;
    tags?: { key?: string; label?: string }[];
    notifyCount?: number;
    unreadCount?: number;
    country?: string;
    access?: string;
    geographic?: {
      province?: { label?: string; key?: string };
      city?: { label?: string; key?: string };
    };
    address?: string;
    phone?: string;
  };

  type LoginResult = {
    code?:number
    status?: string;
    type?: string;
    currentAuthority?: string;
    message?: string;
  };

  type PageParams = {
    current?: number;
    pageSize?: number;
  };

  type RuleListItem = {
    key?: number;
    disabled?: boolean;
    href?: string;
    avatar?: string;
    name?: string;
    owner?: string;
    desc?: string;
    callNo?: number;
    status?: number;
    updatedAt?: string;
    createdAt?: string;
    progress?: number;
  };

  type RuleList = {
    data?: RuleListItem[];
    /** 列表的内容总数 */
    total?: number;
    success?: boolean;
  };

  type FakeCaptcha = {
    code?: number;
    status?: string;
  };

  type LoginParams = {
    account?: string;
    password?: string;
    type?: string;
  };

  type ErrorResponse = {
    /** 业务约定的错误码 */
    errorCode: string;
    /** 业务上的错误信息 */
    errorMessage?: string;
    /** 业务上的请求是否成功 */
    success?: boolean;
  };

  type NoticeIconList = {
    data?: NoticeIconItem[];
    /** 列表的内容总数 */
    total?: number;
    success?: boolean;
  };

  type NoticeIconItemType = 'notification' | 'message' | 'event';

  type NoticeIconItem = {
    id?: string;
    extra?: string;
    key?: string;
    read?: boolean;
    avatar?: string;
    title?: string;
    status?: string;
    datetime?: string;
    description?: string;
    type?: NoticeIconItemType;
  };

  type Tenants = {
    code: number;
    message: string;
    data: Tenant[] | undefined;
  }

  type Tenant = {
    id: number | undefined;
    cnName: string | undefined;
    enName: string | undefined;
  }
}

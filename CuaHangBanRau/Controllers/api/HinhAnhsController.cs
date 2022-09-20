using CuaHangBanRau.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace CuaHangBanRau.Controllers.api
{
    public class HinhAnhsController : ApiController
    {
        CuaHangRauEntities1 db = new CuaHangRauEntities1();
        [Route("api/HinhAnh/GetHinhAnh")]
        public IEnumerable<HinhAnh> Get(int MaSP)
        {
            return db.HinhAnhs.Where(x => x.MaSP == MaSP);
        }
    }
}

import Cart from 'customer/components/Cart/Cart'
import Checkout from 'customer/components/Checkout/Checkout'
import Footer from 'customer/components/Footer/Footer'
import Navigation from 'customer/components/Navigation/Navigation'
import Order from 'customer/components/Order/Order'
import OrderDetails from 'customer/components/Order/OrderDetails'
import Product from 'customer/components/Product/Product'
import ProductDetails from 'customer/components/ProductDetails/ProductDetails'
import HomePage from 'customer/pages/HomePage/HomePage'
import React from 'react'
import { Route, Routes } from 'react-router-dom'

const CustomerRouters = () => {
  return (
    <div>
      <div>
        <Navigation />
      </div>
      <Routes>
        <Route path='/login' element={<HomePage />}></Route>
        <Route path='/register' element={<HomePage />}></Route>
        <Route path='/' element={<HomePage />}></Route>
        <Route path='/cart' element={<Cart />}></Route>
        <Route path='/:levelOne/:levelTwo/:levelThree' element={<Product />}></Route>
        <Route path='/:product/:productId' element={<ProductDetails />}></Route>
        <Route path='/checkout' element={<Checkout />}></Route>
        <Route path='/account/order' element={<Order />}></Route>
        <Route path='/account/order/:orderId' element={<OrderDetails />}></Route>

        {/*  */}
        {/* <Checkout /> */}
        {/* <Order /> */}
        {/* <OrderDetails /> */}
      </Routes>
      <div>
        <Footer />
      </div>
    </div>
  )
}

export default CustomerRouters
